import unittest
from src.problems.Sqrt import Sqrt

class SqrtTest(unittest.TestCase):

    def test_go(self):
        result = Sqrt().go(4)
        self.assertEqual(2, result)


    def test_go(self):
        result = Sqrt().go(8)
        self.assertEqual(2, result)