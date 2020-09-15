from typing import List


class Solution:
    visit = []
    board = []
    offset = [[-1, 0], [0, 1], [1, 0], [0, -1]]

    def exist(self, board: List[List[str]], word: str) -> bool:
        self.visit = [[False] * len(board[0]) for i in range(len(board))]
        self.board = board
        for i in range(0, len(board)):
            for j in range(0, len(board[0])):
                if board[i][j] == word[0]:
                    self.visit[i][j] = True
                    if self.find(word, j, i, 0):
                        return True
                    self.visit[i][j] = False
        return False

    def find(self, word: str, x: int, y: int, idx: int) -> bool:
        if idx == len(word) - 1:
            return True

        h = len(self.board)
        w = len(self.board[0])
        for off in self.offset:
            dx = x + off[0]
            dy = y + off[1]
            if 0 <= dx < w and 0 <= dy < h:
                if not self.visit[dy][dx] and word[idx + 1] == self.board[dy][dx]:
                    self.visit[dy][dx] = True
                    if self.find(word, dx, dy, idx + 1):
                        return True
                    self.visit[dy][dx] = False
        return False
