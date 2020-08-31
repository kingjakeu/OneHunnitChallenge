from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return -2147483648

        cache = [nums[0]]
        max_num = nums[0]

        for i in range(1, len(nums)):
            if nums[i] + cache[i - 1] > nums[i]:
                cache.append(nums[i] + cache[i - 1])
            else:
                cache.append(nums[i])
            max_num = max(max_num, cache[i])

        return max_num
