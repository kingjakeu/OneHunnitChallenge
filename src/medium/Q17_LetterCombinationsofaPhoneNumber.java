package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q17_LetterCombinationsofaPhoneNumber {
    static class Solution {
        List<String> comb;
        public List<String> letterCombinations(String digits) {
            comb = new ArrayList<>();
            int length = digits.length();
            List<Integer> digitList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                digitList.add(digits.charAt(i) - '0');
            }
            if(length > 0) find("", length, 0, digitList);
            return comb;
        }
        public void find(String current, int maxLength, int curIdx,List<Integer> digitList){
            if(current.length() == maxLength){
                comb.add(current);
                return;
            }
            int removed = digitList.get(curIdx);
            int max = removed == 7 || removed == 9 ? 4 : 3;
            int off = removed > 7 ? 1 : 0;
            for (int j = 0; j < max; j++) {
                int idx = ((removed-2) * 3) + off + j;
                find(current + (char)('a' + idx), maxLength, curIdx +1, digitList);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.letterCombinations("23");
    }
}
