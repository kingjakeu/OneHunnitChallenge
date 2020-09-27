from typing import List

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if not nums:
            return 0
        answer = nums[0]
        pre, post = 0, 0
        for i in range(0, len(nums)):
            pre = 1 if pre == 0 else pre
            pre *= nums[i]
            post = 1 if post == 0 else post
            post *= nums[len(nums) - 1 - i]
            answer = max(answer, max(pre, post))
        return answer
