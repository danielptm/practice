import unittest


class CalculusTest(unittest.TestCase):

    def hi(self):
        print("hi")

    def test_hi(self):
        self.hi()