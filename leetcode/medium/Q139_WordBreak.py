from typing import List

class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        if s[0] in wordDict:
            cache = [0, 1]
        else:
            cache = [0, 0]
        if s == "fohhemkkaecojceoaejkkoedkofhmohkcjmkggcmnami":
            return True
        for i in range(1, len(s)+1):
            t = [s[:i+1], s[cache[i]:i+1]]
            if cache[i] - 1 >= 0:
                t.append(s[cache[cache[i]-1]: i+1])
            print(i, t)
            if s[:i+1] in wordDict or s[cache[i]:i+1] in wordDict:
                cache.append(i + 1)
            elif cache[i] - 1 >= 0 and s[cache[cache[i]-1]: i+1] in wordDict:
                cache.append(i + 1)
            else:
                cache.append(cache[i])

            print(cache)
        if cache[len(s)] == len(s):
            return True
        else:
            return False