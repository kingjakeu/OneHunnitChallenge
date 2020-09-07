from typing import List

class Solution:
    answer = []
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        self.answer = []
        self.find(candidates, [], target, 0)
        return self.answer

    def find(self, candidates: List[int], comb: List[int], target: int, idx: int):
        if sum(comb) > target:
            return
        if sum(comb) == target:
            self.answer.append(comb)
            return
        for i in range(idx, len(candidates)):
            comb = comb.copy()
            comb.append(candidates[i])
            self.find(candidates, comb, target, i)
