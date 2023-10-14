import unittest

from src.problems.project_euler.ProjectEuler import ProjectEuler


class ProjectEulerTest(unittest.TestCase):
    def test_problem1(self):
        pj = ProjectEuler()
        res = pj.problem1(1000)
        self.assertEqual(233168, res)

    def test_problem1b(self):
        pj = ProjectEuler()
        res = pj.problem1(10)
        self.assertEqual(23, res)

    def test_problem3(self):
        pj = ProjectEuler()
        res = pj.problem3(600851475143)
        self.assertEqual(6857, res)

    def test_problem3b(self):
        pj = ProjectEuler()
        res = pj.problem3(40)
        self.assertEqual(5, res)


