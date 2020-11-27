import unittest
from src.problems.TwoSum import TwoSum


class TwoSumTest(unittest.TestCase):

    def test_result(self):
        two = TwoSum()
        input = [2, 7, 11, 15]
        target = 9
        expected = [0, 1]
        result = two.twoSum(input, target)
        self.assertEqual(expected, result)

    def test_result2(self):
        two2 = TwoSum()
        inputx = [3, 2, 4]
        target = 6
        expected = [1, 2]
        result = two2.twoSum(inputx, target)
        self.assertEqual(expected, result)

    def test_resul3(self):
        two = TwoSum()
        input = [2, 7, 11, 15]
        target = 9
        expected = [0, 1]
        result = two.twoSumAlt(input, target)
        self.assertEqual(expected, result)

    def test_result4(self):
        two2 = TwoSum()
        inputx = [3, 2, 4]
        target = 6
        expected = [1, 2]
        result = two2.twoSumAlt(inputx, target)
        self.assertEqual(expected, result)

    def test_result5(self):
        two2 = TwoSum()
        inputx = [3, 3]
        target = 6
        expected = [0, 1]
        result = two2.twoSumAlt(inputx, target)
        self.assertEqual(expected, result)


if __name__ == '__main__':
    unittest.main()
