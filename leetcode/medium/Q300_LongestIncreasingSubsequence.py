from typing import List

class Solution:
    def lengthOfLIS(self, nums):
        if not nums:
            return 0
        seq = [1] * len(nums)
        for i in range(len(nums)):
            current = nums[i]
            for j in range(i):
                prev = nums[j]
                if prev < current and seq[j] + 1 > seq[i]:
                    seq[i] = seq[j] + 1
        return max(seq)

s = Solution()
print(s.lengthOfLIS([10,9,2,5,3,7,101,18]))