import unittest
from src.problems.ZigZagConversion import ZigZagConversion

class ZigZagConversionTest(unittest.TestCase):

    def test_testing(self):
        input = 'PAYPALISHIRING'
        num = 3
        expected = 'PAHNAPLSIIGYIR'
        zig_zag = ZigZagConversion().convert(input, num)
        self.assertEqual(expected, zig_zag)

    def test_testing2(self):
        input = 'PAYPALISHIRING'
        num = 4
        expected = 'PINALSIGYAHRPI'
        zig_zag = ZigZagConversion().convert(input, num)
        self.assertEqual(expected, zig_zag)

    def test_testing2(self):
        input = 'ABC'
        num = 2
        expected = 'ACB'
        zig_zag = ZigZagConversion().convert(input, num)
        self.assertEqual(expected, zig_zag)

    def test_testing3(self):
        input = 'ABCD'
        num = 2
        expected = 'ACBD'
        zig_zag = ZigZagConversion().convert(input, num)
        self.assertEqual(expected, zig_zag)

    def test_testing4(self):
        input = 'ABCDE'
        num = 2
        expected = 'ACEBD'
        zig_zag = ZigZagConversion().convert(input, num)
        # ACBED
        self.assertEqual(expected, zig_zag)


    def test_testing5(self):
        input = 'PAYPALISHIRING'
        num = 5
        expected = 'PHASIYIRPLIGAN'
        zig_zag = ZigZagConversion().convert(input, num)
        # ACBED
        self.assertEqual(expected, zig_zag)

