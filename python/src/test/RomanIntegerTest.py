import unittest
from src.problems.RomanInteger import RomanInteger

class RomanIntegerTest(unittest.TestCase):

    def test_1(self):
        s = "III"
        result = RomanInteger().romanToInt(s)
        self.assertEqual(3, result)

    def test_2(self):
        s = "III"
        result = RomanInteger().romanToInt(s)
        self.assertEqual(3, result)

    def test_3(self):
        s = "IV"
        result = RomanInteger().romanToInt(s)
        self.assertEqual(4, result)

    def test_4(self):
        s = "IX"
        result = RomanInteger().romanToInt(s)
        self.assertEqual(9, result)

    def test_5(self):
        s = "LVIII"
        result = RomanInteger().romanToInt(s)
        self.assertEqual(58, result)

    def test_6(self):
        s = "MCMXCIV"
        result = RomanInteger().romanToInt(s)
        self.assertEqual(1994, result)

    def test_four_exists(self):
        s = "XIX"
        result = RomanInteger().four_exists(s)
        self.assertEqual(True, result)
