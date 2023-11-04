import unittest

from src.problems.BiggestIsland import BiggestIsland, get_neighbors, get_unexplored_list, remove_unexplored, print_grid


class BiggestIslandTest(unittest.TestCase):
    def test_solve(self):
        grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
        bi = BiggestIsland()
        res = bi.maxAreaOfIsland(grid)
        self.assertEqual(6, res)


    def test_get_neighbors(self):
        grid = [[0, 1, 0], [1,1,1],[1, 0, 1]]
        pos = (0, 0)
        res = get_neighbors(pos, grid)
        self.assertEqual(2, len(res))


    def test_unexplored(self):
        grid = [[0, 1, 0], [1, 1, 1], [1, 0, 1]]
        unexplored = get_unexplored_list(grid)
        self.assertEqual(9, len(unexplored))
        remove_unexplored((2, 0), unexplored)
        self.assertEqual(8, len(unexplored))

    def test_print_grid(self):
        grid = [[0, 1, 0], [1,1,1],[1, 0, 1]]
        print_grid(grid)