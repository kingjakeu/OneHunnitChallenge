from typing import List

class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        copy_arr = nums.copy()
        copy_arr.sort()

        length = len(nums)
        min_num = length
        max_num = 0
        for i in range(length):
            if nums[i] != copy_arr[i]:
                min_num = min(min_num, i)
                max_num = max(max_num, i)

        if min_num > max_num:
            return 0

        return max_num - min_num + 1
