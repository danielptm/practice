from typing import List

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


