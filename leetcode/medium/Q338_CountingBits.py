from typing import List

class Solution:
    def countBits(self, num: int) -> List[int]:
        answer = [0]
        while len(answer) <= num:
            tmp = []
            for i in answer:
                tmp.append(i+1)
            answer += tmp
        return answer[:num+1]
s = Solution()
print(s.countBits(2))