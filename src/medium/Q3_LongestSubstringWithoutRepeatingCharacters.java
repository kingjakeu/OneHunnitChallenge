package medium;

import java.util.HashSet;
import java.util.Set;

public class Q3_LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            int length = s.length();

            for (int i = 0; i < length; i++) {
                Set<Character> set = new HashSet<>();
                int j = i;
                char c = s.charAt(j);
                int count = 0;
                while (!set.contains(c)){
                    count += 1;
                    j += 1;
                    set.add(c);
                    if(j == length) break;
                    c = s.charAt(j);
                }
                max = Math.max(count, max);
            }
            return max;
        }
    }
}
