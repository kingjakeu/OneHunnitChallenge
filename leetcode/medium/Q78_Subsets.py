from typing import List

class Solution:
    answer = []
    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.answer = []
        for i in range(0, len(nums) + 1):
            self.find(nums, [], i, 0, len(nums))
        return self.answer

    def find(self, nums: List[int], comb: List[int], size: int, sidx: int, eidx: int):
        if len(comb) == size:
            self.answer.append(comb.copy())
            return

        for i in range(sidx, eidx):
            comb.append(nums[i])
            self.find(nums, comb, size, i+1, eidx)
            comb.pop(-1)
