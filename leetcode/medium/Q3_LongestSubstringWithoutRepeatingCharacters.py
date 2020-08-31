class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        max_num = 0
        sets = []
        for c in s:
            if c in sets:
                while c in sets:
                    sets.pop(0)
            sets.append(c)
            max_num = max(max_num, len(sets))
        return max_num