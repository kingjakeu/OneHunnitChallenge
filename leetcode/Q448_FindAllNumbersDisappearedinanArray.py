from typing import List


class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        if not nums:
            return []

        max_num = len(nums)
        check = [False] * max_num

        for num in nums:
            check[num - 1] = True

        answer = []
        for i in range(max_num):
            if not check[i]:
                answer.append(i + 1)

        return answer
