import unittest
from src.problems.TwoSortedArrays import TwoSortedArrays


class TwoSortedArraysTest(unittest.TestCase):

    def test_findMedianSortedArrays(self):
        obj = TwoSortedArrays()
        nums = [1, 3]
        nums2 = [2]

        result = obj.findMedianSortedArrays(nums, nums2)

        self.assertEqual(2, result)

    def test_findMedianSortedArrays2(self):
        obj = TwoSortedArrays()
        nums = [1, 2]
        nums2 = [3, 4]

        result = obj.findMedianSortedArrays(nums, nums2)

        self.assertEqual(2.5, result)


    def test_findMedianSortedArrays3(self):
        obj = TwoSortedArrays()
        nums = [0, 0]
        nums2 = [0, 0]

        result = obj.findMedianSortedArrays(nums, nums2)

        self.assertEqual(0, result)

    def test_findMedianSortedArrays3(self):
        obj = TwoSortedArrays()
        nums = [2]
        nums2 = []

        result = obj.findMedianSortedArrays(nums, nums2)

        self.assertEqual(2, result)

    def test_findMedianSortedArrays4(self):
        obj = TwoSortedArrays()
        nums = [3]
        nums2 = [-2, -1]

        result = obj.findMedianSortedArrays(nums, nums2)

        self.assertEqual(-1, result)

