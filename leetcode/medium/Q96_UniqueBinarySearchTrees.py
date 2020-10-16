class Solution:
    def numTrees(self, n: int) -> int:
        answer = [0] * (n+2)
        answer[0] = 1
        answer[1] = 1

        for i in range(2, n+1):
            answer[i] = 0
            for j in range(i, 0, -1):
                answer[i] += (answer[j-1] * answer[i - j])

        return answer[n]

s = Solution()
a = s.numTrees(3)
print(a)