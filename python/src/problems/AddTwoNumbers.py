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
        nodes = []
        i = 0
        while i < len(str_val):
            node = ListNode(str_val[i])
            nodes.append(node)
            i += 1

        j = 0
        while j < len(nodes):




        return None


