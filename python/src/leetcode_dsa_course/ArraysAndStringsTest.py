import unittest

from src.leetcode_dsa_course.ArraysAndStrings import ArraysAndStrings

class ArraysAndStringsTest(unittest.TestCase):
    def test_reverse_string(self):
        aas = ArraysAndStrings()
        s = ["h", "e", "l", "l", "o"]
        expected = ["o","l","l","e","h"]
        aas.reverseString(s)
        self.assertEqual(expected, s)


    def test_sortedSquares(self):
        aas = ArraysAndStrings()
        i = [-4,-1,0,3,10]
        e = [0,1,9,16,100]
        r = aas.sortedSquares(i)
        self.assertEqual(e, r)