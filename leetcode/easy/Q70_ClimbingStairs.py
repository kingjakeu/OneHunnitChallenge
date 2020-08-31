class Solution:
    def climbStairs(self, n: int) -> int:
        answers = [1, 2, 3]
        for i in range(3, n):
            answers.append(answers[i-1] + answers[i-2])

        return answers[n-1]