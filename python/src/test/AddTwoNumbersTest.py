import unittest
from src.problems.AddTwoNumbers import AddTwoNumbers
from src.problems.AddTwoNumbers import ListNode

class AddTwoNumbersTest(unittest.TestCase):


    def test_result(self):
        addtwo = AddTwoNumbers();
        node3 = ListNode(3)
        node4 = ListNode(4, node3)
        node2 = ListNode(2, node4)

        node4 = ListNode(4)
        node6 = ListNode(6, node4)
        node5 = ListNode(5, node6)

        result = addtwo.addTwoNumbers(node2, node5)

        self.assertEqual(7, result.val)
        self.assertEqual(0, result.next.val)
        self.assertEqual(8, result.next.next.val)

    def test_reverse_num(self):
        node3 = ListNode(3)
        node4 = ListNode(4, node3)
        node2 = ListNode(2, node4)

        addtwo = AddTwoNumbers()
        result = addtwo.reverse_number(node2)

        self.assertEqual(342, result)

    def test_new_list(self):
        input = 123
        addtwo = AddTwoNumbers()

        result = addtwo.new_list(input)

        self.assertEqual(1, result.val)
        self.assertEqual(2, result.next.val)
        self.assertEqual(3, result.next.next.val)