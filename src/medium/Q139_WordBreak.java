package medium;

import java.util.*;

public class Q139_WordBreak {
    static class Solution {
        Set<String> wordSet;
        public boolean wordBreak(String s, List<String> wordDict) {
            wordSet = new HashSet<>(wordDict);
            int length = s.length();
            boolean[] possible = new boolean[length + 1];
            for(String word : wordSet){
                if(s.startsWith(word)){
                    possible[0] = true;
                    if(length >= word.length()) possible[word.length()] = true;
                }
            }
            for (int i = 1; i < length; i++) {
                if(possible[i]){
                    String tmp = s.substring(i);
                    for(String word : wordSet){
                        if(tmp.startsWith(word)){
                            if(length >= i + word.length()) possible[i + word.length()] = true;
                        }
                    }
                }
            }
            return possible[length];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.wordBreak("cars", Arrays.asList("car","ca","rs")));
    }
}
