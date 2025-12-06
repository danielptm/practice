from typing import List
import copy

class ArraysAndStrings:
    def reverseString(self, s: List[str]) -> None:
        l = len(s)
        i = 0
        while i <= l:
            p = s.pop(l - 1)
            s.insert(i, p)
            i+=1

    def sortedSquares(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(len(nums)):
            n = nums[i] ** 2
            res.append(n)
        res.sort()
        return res

    def findMaxAverage(self, nums: List[int], k: int) -> float:
        max_avg = -100000000100000000100000000100000000
        curr_sum = 0
        left = right = 0
        l = len(nums)
        if l== 1:
            return nums[0]
        while right < l:
            if (right - left) != k:
                if (right - left) < k:
                    curr_sum = curr_sum + nums[right]
                    right = right + 1
                elif (right - left) > k:
                    curr_sum = curr_sum - nums[left]
                    left = left + 1
            if (right - left) == k:
                avg_sum = curr_sum / k
                if avg_sum > max_avg:
                    max_avg = avg_sum
                curr_sum = curr_sum - nums[left]
                left = left + 1
        return max_avg

    def getCopy(self, item):
        return copy.deepcopy(item)

    def longestOnes(self, nums: List[int], k: int) -> int:
        new_nums = self.getCopy(nums)
        result = 0
        l = 0
        r = 1
        count = 0
        flipped = 0
        # l_a = []
        while r < len(new_nums):
            if new_nums[l] == 1 and new_nums[r] == 1:
                count+=1
                if count > result:
                    result = count
            elif new_nums[r] != 1 :
                if flipped <= k:
                    new_nums[r] = 1
                    flipped = flipped+1
                    # l_a.append(r)
                    continue
                else:
                    new_nums = self.getCopy(nums)
                    flipped = 0
                    count = 0
                    l +=1
                    r = l+1
                    continue
            r+=1

        return result



