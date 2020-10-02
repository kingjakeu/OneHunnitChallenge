from typing import List

class Solution:
    def maximalSquare(self, matrix: List[List[str]]) -> int:
        answer = 0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == "1":
                    answer = max(answer, self.find(j, i, matrix, 1))
        return answer * answer

    def find(self, x, y, matrix, off) -> int:
        if x + off >= len(matrix[0]) or y + off >= len(matrix):
            return off
        for i in range(x, off+x+1):
            if matrix[y+off][i] == "0":
                return off
        for i in range(y, off+y+1):
            if matrix[i][x+off] == "0":
                return off
        return self.find(x, y, matrix, off+1)

s = Solution()
print(s.maximalSquare([
    ["0","0","0","1","0","1","1","1"],
    ["0","1","1","0","0","1","0","1"],
    ["1","0","1","1","1","1","0","1"],
    ["0","0","0","1","0","0","0","0"],
    ["0","0","1","0","0","0","1","0"],
    ["1","1","1","0","0","1","1","1"],
    ["1","0","0","1","1","0","0","1"],
    ["0","1","0","0","1","1","0","0"],
    ["1","0","0","1","0","0","0","0"]
]))