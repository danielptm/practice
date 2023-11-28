import unittest


class TestAtoi(unittest.TestCase):

    def test_myAtoi(self):
        input = "   -42"
        expected = -42
        result = self.myAtoi(input)
        self.assertEqual(expected, result)

    def test_myAtoi1(self):
        input = "words and 987"
        expected = 0
        result = self.myAtoi(input)
        self.assertEqual(expected, result)

    def test_myAtoi2(self):
        input = "-91283472332"
        expected = -2147483648
        result = self.myAtoi(input)
        self.assertEqual(expected, result)

    def test_myAtoi3(self):
        input = "+-12"
        expected = 0
        result = self.myAtoi(input)
        self.assertEqual(expected, result)

    def test_myAtoi3(self):
        input = "    12"
        expected = 12
        result = self.myAtoi(input)
        self.assertEqual(expected, result)

    def test_myAtoi3(self):
        input = "+"
        expected = 0
        result = self.myAtoi(input)
        self.assertEqual(expected, result)


    def myAtoi(self, s: str) -> int:
        valid = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        white_space = " "
        signs = ["-", "+"]
        reduced = ""
        for i in range(len(s)):
            if len(s) > 1 and s[i] in signs and s[i + 1] in signs:
                break
            if s[i] == white_space:
                continue
            if s[i] in valid or s[i] in signs:
                reduced += s[i]
            else:
                if len(reduced) == 0:
                    return 0
                else:
                    break
        if len(reduced) == 1 and reduced in signs:
            return 0
        if reduced == "":
            return 0
        reduced = reduced.replace("0", "")
        int_res = int(reduced)
        lower_bound = -2 ** 31
        upper_bound = (2 ** 31)
        if int_res < lower_bound:
            return lower_bound
        if int_res > upper_bound:
            return upper_bound
        return int_res