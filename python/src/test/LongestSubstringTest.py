import unittest
from src.problems.LongestSubstring import LongestSubstring

class LongestSubstringTest(unittest.TestCase):

    def test_solution(self):
        input = 'abcabcbb'
        expected = 'abc'
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)

    def test_solution(self):
        input = 'bbbbb'
        expected = 'b'
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)

    def test_solution(self):
        input = 'pwwkew'
        expected = 'wke'
        long = LongestSubstring()
        result = long.lengthOfLongestSubstring(input)
        self.assertEqual(expected, result)
