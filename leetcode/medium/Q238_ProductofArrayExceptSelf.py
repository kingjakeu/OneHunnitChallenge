from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        m = [1]
        for n in nums:
            if n == 0:
                m.append(1)
            else:
                m[-1] *= n
        answer = []
        if len(m) > 2:
            for n in nums:
                answer.append(0)
        else:
            t = 1
            for mm in m:
                t *= mm
            for n in nums:
                if len(m) > 1 and n != 0:
                    answer.append(0)
                else:
                    if n == 0:
                        answer.append(t)
                    else:
                        answer.append(int(t/n))
        return answer