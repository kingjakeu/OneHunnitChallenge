from typing import List

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        h = len(matrix)
        if h == 0:
            return

        self.calc(matrix, 0, h)

    def calc(self, matrix: List[List[int]], start: int, end: int):
        if start >= end:
            return

        for i in range(end-1-start):
            tmp = [matrix[start][start+i], matrix[start+i][end-1], matrix[end-1][end-1-i], matrix[end-i-1][start]]
            matrix[start][start+i] = tmp[3]
            matrix[start+i][end-1] = tmp[0]
            matrix[end-1][end-1-i] = tmp[1]
            matrix[end-i-1][start] = tmp[2]
        self.calc(matrix, start + 1, end - 1)
