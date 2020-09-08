from typing import List, Dict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        answer = []
        dictionary = {}
        for i in range(len(strs)):
            tmp_map = [0] * 26
            for c in strs[i]:
                tmp_map[ord(c) - 97] += 1
            if str(tmp_map) in dictionary:
                dictionary[str(tmp_map)].append(strs[i])
            else:
                dictionary[str(tmp_map)] = [strs[i]]

        for d in dictionary.values():
            answer.append(d)
        return answer
