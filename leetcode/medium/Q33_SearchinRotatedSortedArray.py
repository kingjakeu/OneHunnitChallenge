from typing import List
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        idx = 0
        for num in nums:
            if num == target:
                return idx
            idx += 1
        return -1
