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