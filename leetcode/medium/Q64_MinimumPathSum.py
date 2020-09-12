from typing import List

class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        cache = [[0] * m] * n

        for i in range(n):
            for j in range(m):
                if i-1 < 0 and j-1 < 0:
                    cache[i][j] = grid[i][j]
                elif i-1 < 0:
                    cache[i][j] = grid[i][j] + cache[i][j-1]
                elif j-1 < 0:
                    cache[i][j] = grid[i][j] + cache[i-1][j]
                else:
                    cache[i][j] = grid[i][j] + min(cache[i-1][j], cache[i][j-1])
        return cache[n-1][m-1]
