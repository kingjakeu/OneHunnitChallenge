from typing import List

class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        if not T:
            return []

        stack = [[T[0], 1, 0]]
        answer = [0]

        for i in range(1, len(T)):
            answer.append(0)
            while stack:
                if stack[0][0] < T[i]:
                    s = stack.pop(0)
                    answer[s[2]] = s[1]
                    if stack:
                        stack[0][1] += s[1]
                else:
                    break
            stack.insert(0, [T[i], 1, i])
        return answer

s = Solution()
print(s.dailyTemperatures([73,74,75,71,69,72,76,73]))