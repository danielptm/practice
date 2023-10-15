import unittest

from src.problems.amazon_track_leetcode.Problems import Problems


class ProblemsTest(unittest.TestCase):

    def test_problem_twosum(self):
        input = [2,7,11,15]
        target = 9
        expected = [0, 1]
        result = Problems().twoSum(input, target)
        self.assertEqual(expected, result)

