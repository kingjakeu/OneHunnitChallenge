package algorithm1.slidingwindow;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q3_LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] charArr = s.toCharArray();
            int start = 0;
            int end = 0;
            Set<Character> characterSet = new HashSet<>();
            int maxLength = 0;
            for (int i = 0; i < charArr.length; i++) {
                while (characterSet.contains(charArr[i])){
                    characterSet.remove(charArr[start++]);
                }
                characterSet.add(charArr[i]);
                end += 1;
                maxLength = Math.max(maxLength, end - start);
            }
            return maxLength;
        }
    }
}
