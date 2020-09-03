from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        answer = 0
        left = 0
        right = len(height) - 1

        while left < right:
            min_h = min(height[left], height[right])
            answer = max(answer, (min_h * (right-left)))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return answer

