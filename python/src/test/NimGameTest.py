import unittest
from src.problems.NimGame import NimGame

class NimGameTest(unittest.TestCase):

    def test_result(self):
        nim = NimGame()
        result = nim.canWinNim(4)
        self.assertEqual(True, result)


    def test_result(self):
        nim = NimGame()
        result = nim.canWinNim(1)
        self.assertEqual(True, result)
