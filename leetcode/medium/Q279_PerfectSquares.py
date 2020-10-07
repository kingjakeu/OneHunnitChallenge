import math

class Solution:
    def numSquares(self, n: int) -> int:
        cache = [0] * (n+1)
        i = 1
        while i * i <= n:
            cache[i * i] = 1
            i += 1

        for i in range(n+1):
            s = int(math.sqrt(i))
            if i != s * s:
                j = 1
                while j * j <= i:
                    tmp = cache[j * j] + cache[i - (j * j)]
                    if cache[i] > 0:
                        cache[i] = min(cache[i], tmp)
                    else:
                        cache[i] = tmp
                    j += 1
        return cache[n]
s = Solution()
print(s.numSquares(13))
