import unittest
from src.problems.ReverseInteger import ReverseInteger

# To create new unit tests add configuration for each test class
class ReverseIntegerTest(unittest.TestCase):

    def test_rev(self):
        x = 123
        rev = ReverseInteger()
        result = rev.reverse(x)
        expected = 321
        self.assertEqual(expected, result)

    def test_x(self):
        print(1534236469 < 2147483648)