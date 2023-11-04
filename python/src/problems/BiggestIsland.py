from typing import List


class Node:
    def __init__(self, position):
        self.island_explored = False
        self.neighbors = []
        self.position = position



class Fifo:
    def __init__(self):
        self.queue = []

    def add(self, node):
        self.queue.append(node)

    def pop(self):
        return self.queue.pop(0)

    def length(self):
        return len(self.queue)

    def contains(self, node):
        if node in self.queue:
            return True
        else:
            return False

def get_neighbors(pos, grid, grid_explored):
    neighbors = []
    options = [(pos[0] - 1, pos[1]),  (pos[0], pos[1] + 1), (pos[0] + 1, pos[1]), (pos[0], pos[1] - 1)]
    for o in options:
        if o[0] >= 0 and o[1] >= 0 and o[0] < 8  and o[1] < 13 and o not in grid_explored:
            if grid[o[0]][o[1]] == 1 :
                n = Node(o)
                neighbors.append(n)
    return neighbors

def get_unexplored_list(grid):
    outer_length = len(grid)
    inner_length = len(grid[0])
    result = []
    for i in range(inner_length):
        for j in range(outer_length):
            result.append((j, i))
    return result

def remove_unexplored(pos, unexplored_list: List):
    if pos in unexplored_list:
        unexplored_list.remove(pos)

def print_grid(grid):
    print("*****************************************")
    for j in range(len(grid)):
        print(j, end="")
        print("|", end="")
        for i in range(len(grid[0])):
            print(" ", end="")
            print(grid[j][i], end="")
            print(" ", end="")
        print("")

# https://leetcode.com/problems/max-area-of-island/
class BiggestIsland:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        unexplored = get_unexplored_list(grid)
        grid_explored = []
        fifo = Fifo()
        pos = (0, 0)
        n = Node(pos)
        fifo.add(n)
        island_size = 0
        sizes = []
        current_island = []
        islands = []
        while fifo.length() > 0:
            if len(unexplored) == 0:
                biggest_island = max(sizes)
                return biggest_island
            curr_node: Node = fifo.pop()
            curr_node.island_explored = True
            remove_unexplored(curr_node.position, unexplored)
            grid_explored.append(curr_node.position)
            if grid[curr_node.position[0]][curr_node.position[1]] == 1:
                island_size = island_size + 1
                current_island.append(curr_node.position)
                neighbors = get_neighbors(curr_node.position, grid, grid_explored)
                print("")
                print(curr_node.position)
                print_grid(grid)
                for n in neighbors:
                    fifo.add(n)
                if len(neighbors) == 0:
                    if island_size not in sizes:
                        sizes.append(island_size)
                        island_size = 0
            if fifo.length() == 0 and len(unexplored) > 0:
                pos = unexplored.pop()
                n = Node(pos)
                fifo.add(n)
        biggest_island = max(sizes)
        return biggest_island



