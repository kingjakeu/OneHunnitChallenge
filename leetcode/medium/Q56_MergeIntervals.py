from typing import List

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        answer = []
        intervals.sort()
        for interval in intervals:
            b = False
            for ans in answer:
                if interval[0] >= ans[0] and interval[1] <= ans[1]:
                    b = True
                elif interval[0] <= ans[0] and interval[1] >= ans[1]:
                    ans[0] = interval[0]
                    ans[1] = interval[1]
                    b = True
                elif interval[0] <= ans[0] and interval[1] <= ans[1] and interval[1] >= ans[0]:
                    ans[0] = interval[0]
                    b = True
                elif interval[0] >= ans[0] and interval[1] >= ans[1] and interval[0] <= ans[1]:
                    ans[1] = interval[1]
                    b = True
                if b:
                    break
            if not b:
                answer.append(interval)
        return answer
