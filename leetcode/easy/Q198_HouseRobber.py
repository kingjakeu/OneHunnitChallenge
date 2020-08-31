from typing import List

class Solution:
    def rob(self, nums: List[int]) -> int:
        length = len(nums)
        if length == 0:
            return 0
        elif length == 1:
            return nums[0]

        max_num = max(nums[0], nums[1])
        cache = [0, nums[0], nums[1]]
        for i in range(2, length):
            cache.append(max(nums[i] + cache[i-1], nums[i] + cache[i-2]))
            max_num = max(cache[i], max_num)
        return max(max_num, cache[-1])
