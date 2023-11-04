import unittest

from src.problems.project_euler.Util import is_prime_easy, get_all_factors_for_number


class UtilTest(unittest.TestCase):

    def test_is_prime1(self):
        num = 18
        result = is_prime_easy(num)
        self.assertFalse(result)

    def test_is_prime2(self):
        num = 9
        result = is_prime_easy(num)
        self.assertFalse(result)

    def test_is_prime3(self):
        num = 27
        result = is_prime_easy(num)
        self.assertFalse(result)

    def test_get_all_factors_for_number(self):
        num = 50
        result = get_all_factors_for_number(num)
        self.assertEqual([1, 2, 5, 10, 25, 50], result)