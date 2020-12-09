import unittest
from src.problems.LongestPalindromeSubstring import LongestPalindromeSubstring

class LongestPalindromeS(unittest.TestCase):

    def test_result1(self):
        s = "babad"
        expected = "aba"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertTrue(expected, result)

    def test_result2(self):
        s = "cbbd"
        expected = "bb"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertEqual(expected, result)

    def test_result3(self):
        s = "a"
        expected = "a"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertEqual(expected, result)

    def test_result4(self):
        s = "ac"
        expected = "a"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertEqual(expected, result)

    def test_result5(self):
        s = "abb"
        expected = "bb"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertEqual(expected, result)

    def test_result6(self):
        s = "bb"
        expected = "bb"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertEqual(expected, result)

    def test_result7(self):
        s = "eabcb"
        expected = "bcb"
        ls = LongestPalindromeSubstring()
        result = ls.longestPalindrome(s)
        self.assertEqual(expected, result)

    # def test_print(self):
    #     x = 'abcde'
    #     print(x[0:len(x) - 1])
    #     print(x[1:len(x)])