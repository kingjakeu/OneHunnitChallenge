from typing import List

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        phoneletter = {"2": ["a", "b", "c"], "3": ["d", "e", "f"], "4": ["g", "h", "i"],
                       "5": ["j", "k", "l"], "6": ["m", "n", "o"], "7": ["p", "q", "r", "s"],
                       "8": ["t", "u", "v"], "9": ["w", "x", "y", "z"]}
        answer = []
        for d in digits:
            if not answer:
                for s in phoneletter[d]:
                    answer.append(s)
            else:
                tmp = []
                for a in answer:
                    for s in phoneletter[d]:
                        tmp.append(a+s)
                answer = tmp
        return answer