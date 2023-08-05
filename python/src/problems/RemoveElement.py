from typing import List


'''
This problem seems like it is not right in leetcode. Not sure what they want here.
https://leetcode.com/problems/remove-element/
'''
class RemoveElement:

    def remove_element(self, nums: List[int], val: int) -> int:
        result = []
        num_blanks = 0
        num_pos = 0
        for i in range(len(nums)):
            if nums[i] != val:
                result.append(nums[i])
                num_pos += 1
            else:
                num_blanks += 1
        for i in range(num_blanks):
            result.append("_")
        return [num_pos, result]