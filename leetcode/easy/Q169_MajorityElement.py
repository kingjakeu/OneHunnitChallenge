from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        num_dict = {}
        major = len(nums) / 2

        for num in nums:
            if num in num_dict:
                num_dict[num] = num_dict[num]+1
            else:
                num_dict[num] = 1

        for k, v in num_dict.items():
            if v > major:
                return k
        return None
