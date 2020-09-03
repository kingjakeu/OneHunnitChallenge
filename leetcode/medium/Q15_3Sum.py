from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        answer = []
        nums.sort()

        last1 = 0
        set1 = set()
        for i in range(0, len(nums)-2):
            if last1 == nums[i] and i > 0:
                continue
            start = i+1
            end = len(nums) - 1
            last1 = nums[i]
            while start < end:
                if nums[i] + nums[start] + nums[end] == 0:
                    str1 = str([nums[i], nums[start], nums[end]])
                    if str1 not in set1:
                        answer.append([nums[i], nums[start], nums[end]])
                        set1.add(str1)
                if nums[i] + nums[start] + nums[end] < 0:
                    start += 1
                else:
                    end -= 1
        return answer
