import unittest
from src.problems.LongestSubstring import LongestSubstring

class LongestSubstringTest(unittest.TestCase):

    def test_solution(self):
        input = 'abcabcbb'
        expected = 3
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)

    def test_solution2(self):
        input = 'bbbbb'
        expected = 1
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)

    def test_solution3(self):
        input = 'pwwkew'
        expected = 3
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)

    def test_solution3(self):
        input = 'aab'
        expected = 2
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)

    # def test_solution3(self):
    #     input = 'dvdf'
    #     expected = 3
    #     long = LongestSubstring()
    #     result = long.lengthOfLongestSubstring(input)
    #     self.assertEqual(expected, result)
