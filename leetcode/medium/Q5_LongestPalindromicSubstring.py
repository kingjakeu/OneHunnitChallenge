class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) <= 1:
            return s
        answer = ""
        for i in range(0, len(s)-1):
            tmp = self.find(s, i, i)
            if s[i] == s[i+1]:
                tmp2 = self.find(s, i, i+1)
                tmp = len(tmp) < len(tmp2) and tmp2 or tmp

            answer = len(answer) < len(tmp) and tmp or answer
        return answer

    def find(self, s: str, left: int, right: int):
        tmp = ""
        while left >= 0 and right < len(s):
            if s[left] != s[right]:
                break
            else:
                tmp = s[left:right+1]
            left -= 1
            right += 1
        return tmp

