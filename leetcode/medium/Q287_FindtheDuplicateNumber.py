from typing import List

class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        keys = set()
        for n in nums:
            if n in keys:
                return n
            keys.add(n)
        return -1
