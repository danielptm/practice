from typing import List

# https://leetcode.com/problems/two-sum/
class TwoSum:

    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        i = 0
        while i < len(nums):
            j = 0
            while j < len(nums):
                if i != j:
                    sum = nums[i] + nums[j]
                    if sum == target:
                        result.append(i)
                        result.append(j)

                j += 1
            if len(result) == 2:
                break
            i += 1
        return result

    def twoSumAlt(self, nums: List[int], target: int) -> List[int]:
        result = []
        numsMap = {}
        i = 0
        while i < len(nums):
            numsMap[nums[i]] = {'index': i, 'value': nums[i]}
            i += 1
        j = 0
        while j < len(nums):
            diff = target - nums[j]
            if diff in numsMap:
                search_item = numsMap[diff]
                other_index = search_item['index']
                if other_index != j:
                    result.append(j)
                    result.append(other_index)
                    break
            j += 1

        return result



