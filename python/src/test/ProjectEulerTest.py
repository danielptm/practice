import unittest

from src.problems.ProjectEuler import ProjectEuler


class ProjectEulerTest(unittest.TestCase):
    def test_problem1(self):
        pj = ProjectEuler()
        res = pj.problem1(1000)
        self.assertEqual(233168, res)

    def test_problem1(self):
        pj = ProjectEuler()
        res = pj.problem1(10)
        self.assertEqual(23, res)
