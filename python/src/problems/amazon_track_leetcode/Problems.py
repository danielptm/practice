from typing import List


# https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
class Problems:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        '''
        optimization tricks:
        1) We can sort the array so that smaller numbers come first. This is useful because in this use case there are
        numbers that are larger than the target which are therefore not going to be a solution.
        2)

        '''
        nums = sorted(nums)
        result = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i != j:
                    summ = nums[i] + nums[j]
                    if summ == target:
                        result.append(i)
                        result.append(j)
                        return result

