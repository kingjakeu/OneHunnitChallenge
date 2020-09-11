class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        cache = [[1] * m] * n
        for i in range(1, n):
            for j in range(1, m):
                top = 0 if i - 1 < 0 else cache[i-1][j]
                left = 0 if j - 1 < 0 else cache[i][j-1]
                cache[i][j] = top + left

        return cache[n-1][m-1]
