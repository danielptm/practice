import unittest
import re

from src.problems.Atoi import Atoi


class AtoiTest(unittest.TestCase):

    def test_myAtoin1(self):
        input = "42"
        expect = 42
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)
        return None

    def test_myAtoin2(self):
        input = "   -42"
        expect = -42
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin3(self):
        input = "4193 with words"
        expect = 4193
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin4(self):
        input = "words and 987"
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin5(self):
        input = "-91283472332"
        expect = -2147483648
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin6(self):
        input = ""
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin7(self):
        input = "  -0012a42"
        expect = -12
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin8(self):
        input = "+-12"
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin8(self):
        input = "0"
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin9(self):
        input = "+"
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin9(self):
        input = "00000-42a1234"
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)

    def test_myAtoin10(self):
        input = "0  123"
        expect = 0
        result = Atoi().myAtoi(input)
        self.assertEqual(expect, result)