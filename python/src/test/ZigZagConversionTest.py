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

    def test_testin(self):
        print(5 % 3)
