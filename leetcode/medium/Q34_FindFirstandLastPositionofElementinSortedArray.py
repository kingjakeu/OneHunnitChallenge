from typing import List

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start = 0
        end = len(nums) - 1
        sflag, eflag = False, False

        while start <= end and (not sflag or not eflag):
            if nums[start] != target and not sflag:
                start += 1
            else:
                sflag = True
            if nums[end] != target and not eflag:
                end -= 1
            else:
                eflag = True
        if start >= len(nums) or end < 0:
            return [-1, -1]

        if nums[start] != target:
            start = -1
        if nums[end] != target:
            end = -1
        return [start, end]
