from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_num = 0
        cache = [0]
        for i in range(1, len(prices)):
            cache.append(max(0, cache[i-1]-(prices[i-1]-prices[i])))
            max_num = max(max_num, cache[i])
        return max_num