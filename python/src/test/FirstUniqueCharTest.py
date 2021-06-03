import unittest

from src.problems.FirstUniqueChar import FirstUniqueChar


class FirstUniqueCharTest(unittest.TestCase):

    def test_firstUniqChar(self):
        input = "leetcode"
        result = FirstUniqueChar().firstUniqChar(input)
        self.assertEqual(0, result)


    def test_firstUniqChar(self):
        input = "loveleetcode"
        result = FirstUniqueChar().firstUniqChar(input)
        self.assertEqual(2, result)


    def test_firstUniqChar(self):
        input = "aabb"
        result = FirstUniqueChar().firstUniqChar(input)
        self.assertEqual(-1, result)

