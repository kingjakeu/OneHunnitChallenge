from typing import List

class Solution:
    answer = []
    def permute(self, nums: List[int]) -> List[List[int]]:
        self.answer = []
        self.find(nums, [])
        return self.answer

    def find(self, nums: List[int], comb: List[int]):
        if not nums:
            self.answer.append(comb)
            return

        length = len(nums)
        for i in range(length):
            newComb = comb.copy()
            tmp = nums.pop(0)
            newComb.append(tmp)
            self.find(nums, newComb)
            nums.append(tmp)
