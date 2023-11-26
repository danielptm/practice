import unittest
from typing import List


class TestMajorityElement(unittest.TestCase):

    def majorityElement(self, nums: List[int]) -> int:
        e = {}
        for n in nums:
            if n not in e:
                e[n] = 0
            else:
                e[n] = e[n] + 1
        largest_k = -1000000
        largest_v = - 1000000
        for k,v in e.items():
            if v > largest_v:
                largest_k = k
                largest_v = v
        return largest_k

    def test_majorityElement(self):
        nums = [3,2,3]
        res = self.majorityElement(nums)
        self.assertEqual(3, res)