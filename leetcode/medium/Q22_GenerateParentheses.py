from typing import List
class Solution:
    answer = []
    def generateParenthesis(self, n: int) -> List[str]:
        self.gen(n, n, "")
        print(self.answer)
        return self.answer


    def gen(self, left: int, right: int, s: str):
        if left == 0 and right == 0:
            self.answer.append(s)
            return
        if left > 0:
            self.gen(left-1, right, s+"(")
        if right > 0 and right != left:
            self.gen(left, right-1, s+")")
