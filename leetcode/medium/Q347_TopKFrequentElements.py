from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = {}
        for n in nums:
            if n in dic:
                dic[n] += 1
            else:
                dic[n] = 1

        dic = sorted(dic.items(), key=lambda x: x[1], reverse=True)
        answer = []
        idx = 0
        for key, value in dic:
            if idx >= k:
                break
            answer.append(key)
            idx += 1

        return answer

s = Solution()
print(s.topKFrequent([3,0,1,0], 1))