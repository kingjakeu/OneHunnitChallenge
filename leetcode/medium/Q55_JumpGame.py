from typing import List

class Solution:
    visit = []
    def canJump(self, nums: List[int]) -> bool:
        self.visit = [False] * len(nums)
        return self.jump(nums, 0)

    def jump(self, nums: List[int], idx: int):
        if idx > len(nums) - 1:
            return False

        self.visit[idx] = True
        if self.visit[len(nums)-1]:
            return True
        if self.visit[idx+min(nums[idx], len(nums)-idx-1)]:
            return False
        b = False
        for i in range(min(nums[idx], len(nums)-idx-1), 0, -1):
            if not self.visit[idx + i]:
                b = b | self.jump(nums, idx + i)
            if self.visit[len(nums) - 1]:
                return b
        return b
