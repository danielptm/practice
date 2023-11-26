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
