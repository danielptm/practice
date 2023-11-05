from typing import List, Optional



class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


# https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/508/
class Problems:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        '''
        optimization tricks:
        1) We can sort the array so that smaller numbers come first. This is useful because in this use case there are
        numbers that are larger than the target which are therefore not going to be a solution.
        2)
        '''
        # Solution 1
        # nums = sorted(nums)
        # result = []
        # for i in range(len(nums)):
        #     for j in range(len(nums)):
        #         if i != j:
        #             summ = nums[i] + nums[j]
        #             if summ == target:
        #                 result.append(i)
        #                 result.append(j)
        #                 return result
        # Solution 2 (optimized)
        previously_found = {}
        for i in range(len(nums)):
            if i == 0:
                previously_found[nums[i]] = i
                continue
            curr = nums[i]
            diff = target - curr
            if diff in previously_found and (diff + curr == target):
                return [previously_found[diff], i]
            previously_found[nums[i]] = i


    #https://leetcode.com/explore/interview/card/amazon/77/linked-list/513/
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        if l1.next != None and l2.next != None:
            self.addTwoNumbers(l1.next, l2.next)
        pass


    # https://leetcode.com/explore/interview/card/amazon/76/array-and-strings/2961/
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s == "":
            return 0
        sub_strings = []
        curr_root = ""
        for i in range(len(s)):
            curr_root = s[i]
            sub_strings.append((1, curr_root))
            for j in range(i, len(s), 1):
                if i == j:
                    continue
                if s[j] not in curr_root:
                    curr_root += s[j]
                    node = (len(curr_root), curr_root)
                    if node not in sub_strings:
                        sub_strings.append(node)
                else:
                    curr_root = ""
                    break
        sub_strings = sorted(sub_strings)
        result = sub_strings[len(sub_strings) - 1]
        return result[0]
