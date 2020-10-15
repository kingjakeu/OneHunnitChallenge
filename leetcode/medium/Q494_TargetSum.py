from typing import List

class Solution:
    dic = {}
    def findTargetSumWays(self, nums: List[int], S: int) -> int:
        self.dic = {}
        return self.find(nums, S, 0, 0)

    def find(self, nums: List[int], target: int, current: int, idx: int) -> int:
        if (idx, current) not in self.dic:
            if idx == len(nums):
                if current == target:
                    self.dic[(idx, current)] = 1
                else:
                    self.dic[(idx, current)] = 0
            else:
                self.dic[(idx, current)] = self.find(nums, target, current + nums[idx], idx+1) + self.find(nums, target, current - nums[idx], idx+1)
        return self.dic[(idx, current)]

s = Solution()
a = s.findTargetSumWays([1, 1, 1, 1, 1], 3)
print(a)


