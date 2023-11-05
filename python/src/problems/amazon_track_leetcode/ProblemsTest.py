import unittest

from src.problems.amazon_track_leetcode.Problems import Problems, ListNode


class ProblemsTest(unittest.TestCase):

    def test_problem_twosum(self):
        input = [2,7,11,15]
        target = 9
        expected = [0, 1]
        result = Problems().twoSum(input, target)
        self.assertEqual(expected, result)

    def test_addTwoNumbers(self):
        l1 = [2, 4, 3]
        l2 = [5, 6, 4]
        expected = [7,0,8]
        l1_n1 = ListNode(2)
        l1_n2 = ListNode(4)
        l1_n3 = ListNode(3)

        l1_n2.next = l1_n3
        l1_n1.next = l1_n2

        l2_n1 = ListNode(5)
        l2_n2 = ListNode(6)
        l2_n3 = ListNode(4)

        l2_n2.next = l2_n3
        l2_n1.next = l2_n2

        result = Problems().addTwoNumbers(l1_n1, l2_n1)
        self.assertEqual(True, False)


    def test_lengthOfLongestSubstring(self):
        p = Problems()
        res = p.lengthOfLongestSubstring("abcabcbb")
        self.assertEqual(3, res)

    def test_lengthOfLongestSubstring1(self):
        p = Problems()
        res = p.lengthOfLongestSubstring("pwwkew")
        self.assertEqual(3, res)

    def test_lengthOfLongestSubstring2(self):
        p = Problems()
        res = p.lengthOfLongestSubstring("abcabcbb")
        self.assertEqual(3, res)

    def test_lengthOfLongestSubstring3(self):
        p = Problems()
        res = p.lengthOfLongestSubstring("bbbbbb")
        self.assertEqual(1, res)

    def test_lengthOfLongestSubstring4(self):
        p = Problems()
        res = p.lengthOfLongestSubstring("abcabcbb")
        self.assertEqual(3, res)
