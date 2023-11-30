import unittest
from typing import List


class TestHashing(unittest.TestCase):

    def checkIfPangram(self, sentence: str) -> bool:
        """
        A pangram is a sentence where every letter of the English alphabet appears at least once.
        :type sentence: str
        :rtype: bool
        """
        s = set()
        for c in sentence:
            s.add(c)
        l = len(s)
        if l == 26:
            return True
        return False

    def test_checkIfPangram(self):
        sentence = "thequickbrownfoxjumpsoverthelazydog"
        res = self.checkIfPangram(sentence)
        self.assertEqual(True, res)

    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums) + 1
        for i in range(n):
            if i in nums:
                continue
            else:
                return i

    def test_misingNumber(self):
        nums = [3, 0, 1]
        e = 2
        res = self.missingNumber(nums)
        self.assertEqual(e, res)

    def test_missinNumber2(self):
        nums = [0, 1]
        e = 2
        res = self.missingNumber(nums)
        self.assertEqual(e, res)

    def countElements(self, arr: List[int]) -> int:
        count = 0
        for n in arr:
            c = n + 1
            if c in arr:
                count += 1
        return count

    def test_countElements(self):
        arr = [1, 2, 3]
        e = 2
        res = self.countElements(arr)
        self.assertEqual(e, res)

    def test_countElements2(self):
        arr = [1, 1, 3, 3, 5, 5, 7, 7]
        e = 0
        res = self.countElements(arr)
        self.assertEqual(e, res)

    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        lost_match_records = {}
        result = [[], []]
        winners = set()
        for m in matches:
            winners.add(m[0])
            if m[1] not in lost_match_records.keys():
                lost_match_records[1] = 1
            else:
                lost_match_records[1] = lost_match_records[1] + 1
        for w in winners:
            if w not in lost_match_records.keys():
                result[0].append(w)
        for k,v in lost_match_records.items():
            if k == 1:
                result[1].append(v)
        return result

    def test_findWinners(self):
        matches = [[1, 3], [2, 3], [3, 6], [5, 6], [5, 7], [4, 5], [4, 8], [4, 9], [10, 4], [10, 9]]
        e = [[1, 2, 10], [4, 5, 7, 8]]
        res = self.findWinners(matches)
        self.assertEqual(e, res)
