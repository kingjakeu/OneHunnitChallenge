from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        length = len(nums)
        idx = 0
        for i in range(length):
            if nums[idx] == 0:
                nums.pop(idx)
                nums.append(0)
            else:
                idx += 1
