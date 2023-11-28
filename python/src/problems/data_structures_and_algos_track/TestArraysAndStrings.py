import unittest
from typing import List


class ArraysAndSTrings(unittest.TestCase):

    # Reverses a string in place, does not return anything, no extra memory alotted.
    def reverseString(self, s: List[str]):
        l = len(s)
        for i in range(l):
            letter = s.pop(i)
            s.insert(0, letter)

    def test_ReverseString(self):
        s = ["H", "a", "n", "n", "a", "h"]
        e = ["h","a","n","n","a","H"]
        res = self.reverseString(s)
        self.assertEqual(e, s)


    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = []
        while (len(nums)) > 0:
            if len(nums) == 0:
                break
            if len(nums) > 1:
                ith = abs(nums.pop(0))
                jth = abs(nums.pop(len(nums) - 1))
                if ith > jth:
                    result.insert(0, ith**2)
                    result.insert(0, jth**2)
                else:
                    result.insert(0, jth**2)
                    result.insert(0, ith**2)
            else:
                ith = abs(nums.pop())
                result.insert(0, ith**2)
        return result


    def test_sortedSquares(self):
        nums = [-4, -1, 0, 3, 10]
        e = [0, 1, 9, 16, 100]
        res = self.sortedSquares(nums)
        self.assertEqual(e, res)

    def count_zeros_in_window(self, curr, right, nums):
        count = 0
        for i in range(curr, right, 1):
            if nums[i] == 0:
                count+=1
        return count

    '''
    https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/703/arraystrings/4595/
    This solves the problem buy for large inputs it takes too long. Reason being is that there is another loop to count number of zeros.
    This can be improve by counting the zeros as the window expands/adjusts.
    '''
    def longestOnes(self, nums, k):
        curr = 0
        right = 0
        l = len(nums)
        long_arr = 0
        sub_a_l = 0
        curr_sub = []
        while right < l:
            num_zeros = self.count_zeros_in_window(curr, right, nums)
            if num_zeros <= k:
                right += 1
            num_zeros = self.count_zeros_in_window(curr, right, nums)
            if num_zeros > k:
                curr += 1
            curr_sub = nums[curr:right]
            sub_a_l = len(curr_sub)
            if sub_a_l > long_arr:
                long_arr = sub_a_l

        return long_arr


    def test_longestOnes(self):
        nums = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1]
        k = 3
        e = 10
        res = self.longestOnes(nums,k)
        self.assertEqual(e, res)

    def test_longestOnes2(self):
        nums = [1,1,1,0,0,0,1,1,1,1,0]
        k = 2
        e = 6
        res = self.longestOnes(nums,k)
        self.assertEqual(e, res)


    def test_longestOnes3(self):
        nums = [0,0,0,1]
        k = 4
        e = 4
        res = self.longestOnes(nums,k)
        self.assertEqual(e, res)


