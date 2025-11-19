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

    def test_findMaxAverage(self):
        nums = [1, 12, -5, -6, 50, 3]
        k = 4
        output = 12.75000

        aas = ArraysAndStrings()
        res = aas.findMaxAverage(nums, k)
        self.assertEqual(output, res)

    def test_findMaxAverage2(self):
        nums = [4,0,4,3,3]
        k = 5
        output = 2.80000

        aas = ArraysAndStrings()
        res = aas.findMaxAverage(nums, k)
        self.assertEqual(output, res)