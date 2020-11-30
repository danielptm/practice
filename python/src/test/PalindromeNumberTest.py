import unittest
from src.problems.PalindromeNumber import PalinedromeNumber

class PalindromeNumberTest(unittest.TestCase):

    def test_is_palindrome(self):
        pr = PalinedromeNumber()
        x = 121
        expected = True
        result = pr.isPalindrome(x)

        self.assertEqual(expected, result)

    def test_is_palindrome(self):
        pr = PalinedromeNumber()
        x = 2222
        expected = True
        result = pr.isPalindrome(x)

        self.assertEqual(expected, result)

    def test_test(self):
        print (4//2)