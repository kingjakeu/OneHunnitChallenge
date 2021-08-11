package medium;

public class Q5_LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            int length = s.length();
            int maxLength = 0;
            String ans = "";
            for (int i = 0; i < length; i++) {
                String tmp = find(i, i, s, length);
                int tmpLength = tmp.length();
                if(tmpLength > maxLength){
                    maxLength = tmpLength;
                    ans = tmp;
                }
            }
            for (int i = 0; i < length-1; i++) {
                if(s.charAt(i) == s.charAt(i+1)){
                    String tmp = find(i, i+1, s, length);
                    int tmpLength = tmp.length();
                    if(tmpLength > maxLength){
                        maxLength = tmpLength;
                        ans = tmp;
                    }
                }
            }
            return ans;
        }

        public String find(int start, int end, String s, int length){
            if(start - 1 < 0 || end + 1 >= length) return s.substring(start, end + 1);
            if(s.charAt(start-1) == s.charAt(end + 1)) return find(start - 1, end + 1, s, length);
            return s.substring(start, end + 1);
        }
    }
}
