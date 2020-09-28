from typing import List

class Solution:
    visited = []
    def numIslands(self, grid: List[List[str]]) -> int:
        self.visited = []
        h, w = len(grid), len(grid[0])
        for i in range(0, h):
            v = []
            for j in range(0, w):
                v.append(0)
            self.visited.append(v)

        answer = 0
        for i in range(0, h):
            for j in range(0, w):
                if grid[i][j] == "1" and self.visited[i][j] == 0:
                    self.find(j, i, grid, h, w)
                    answer += 1

        return answer

    def find(self, x, y, grid, h, w):
        off = [[0, 1], [1, 0], [0, -1], [-1, 0]]
        if self.visited[y][x] == 0:
            self.visited[y][x] = 1
            for i in range(4):
                dy, dx = y + off[i][0], x + off[i][1]
                if 0 <= dy < h and 0 <= dx < w:
                    if self.visited[dy][dx] == 0 and grid[dy][dx] == "1":
                        self.find(dx, dy, grid, h, w)

s = Solution()
p = s.numIslands([["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]])
print(p)