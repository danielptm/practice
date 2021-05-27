import unittest
from src.problems.NumberOfRectangles import NumberOfRectangles


class NumberOfRectanlgesTest(unittest.TestCase):

    def test1(self):
        obj = NumberOfRectangles()
        rectangles = [[5, 8], [3, 9], [5, 12], [16, 5]]
        result = obj.countGoodRectangles(rectangles)
        self.assertEqual(3, result)

    def test2(self):
        obj = NumberOfRectangles()
        rectangles = [[2, 3], [3, 7], [4, 3], [3, 7]]
        result = obj.countGoodRectangles(rectangles)
        self.assertEqual(3, result)
