class Solution:
    def decodeString(self, s: str) -> str:
        answer = ""
        stack = []
        tmp = ""
        for c in s:
            if '0' <= c <= '9':
                if tmp and not '0' <= tmp[0] <= '9':
                    stack.append(tmp)
                    tmp = ""
                tmp += c
            elif c == '[':
                stack.append(tmp)
                tmp = ""
            elif c == ']':
                if not tmp:
                    tmp = stack.pop()
                n = stack.pop()
                while not '0' <= n[0] <= '9':
                    tmp = n + tmp
                    n = stack.pop()
                stack.append(tmp * int(n))
                tmp = ""
            else:
                tmp += c
        if tmp:
            stack.append(tmp)
        while stack:
            i = stack.pop(0)
            if i:
                answer += i
        return answer

s = Solution()
print(s.decodeString("100[leetcode]"))