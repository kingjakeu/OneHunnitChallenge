package algorithm1.slidingwindow;

import java.util.*;

public class Q567_PermutationinString {
    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if(s1.length() > s2.length()) return false;

            int[] count1 = new int[26];
            int[] count2 = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                count1[s1.charAt(i) - 'a'] += 1;
                count2[s2.charAt(i) - 'a'] += 1;
            }

            int left = 0;
            int right = s1.length();
            while (right < s2.length()){
                if(isSame(count1, count2)) return true;
                count2[s2.charAt(left++) - 'a'] -= 1;
                count2[s2.charAt(right++) - 'a'] += 1;
            }
            return isSame(count1, count2);
        }

        public boolean isSame(int[] count1, int[] count2){
            for (int i = 0; i < count1.length; i++) {
                if(count1[i] != count2[i]) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.checkInclusion("dinitrophenylhydrazine", "acetylphenylhydrazine");
    }
}
