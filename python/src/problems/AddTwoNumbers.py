import functools

# Read that: https://medium.com/the-renaissance-developer/problem-solving-skills-add-two-numbers-1db9af05039
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class AddTwoNumbers:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        num1 = self.reverse_number(l1)
        num2 = self.reverse_number(l2)
        sum = num1 + num2
        new_list = self.new_list(sum)
        return new_list

    def reverse_number(self, l: ListNode) -> int:
        nums = []
        curr = l
        while curr is not None:
            nums.append(str(curr.val))
            curr = curr.next
        nums.reverse()
        val = functools.reduce(lambda a, b : a + b, nums)
        return int(val)

    def new_list(self, num: int) -> ListNode:
        str_val = str(num)
        nums = []
        i = 0
        while i < len(str_val):
            nums.append(int(str_val[i]))
            i += 1
        nums.reverse()
        j = 1
        base = ListNode(nums[0])
        while j < len(nums):
            self.create(base, nums[j])
            j += 1
        return base

    def create(self, node: ListNode, num: int):
        new_node = ListNode(num)
        curr = node
        while curr.next is not None:
            curr = curr.next
        curr.next = new_node


