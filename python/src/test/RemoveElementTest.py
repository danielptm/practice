import unittest
from src.problems.RemoveElement import RemoveElement

class RemoveElementTest(unittest.TestCase):

    def test_1(self):
        nums = [3,2,2,3]
        expected = [2, 2, "_", "_"]
        rm = RemoveElement()
        first, second = rm.remove_element(nums, 3)
        self.assertEquals(first, 2)
