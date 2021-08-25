package medium;

import java.util.*;

public class Q22_GenerateParentheses {
    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> answer = new ArrayList<>();
            backTrack(answer, "", 0, 0, n);
            return answer;
        }

        public void backTrack(List<String> strList, String current, int open, int close, int max){
            if(open == max && close == max){
                strList.add(current);
                return;
            }
            if(open < max){
                backTrack(strList, current+"(", open +1, close, max);
            }
            if(close < open){
                backTrack(strList, current+")", open, close +1, max);
            }
        }

        // permutation
        List<Set<String>> comb;
        public List<String> generateParenthesis_perm(int n) {
            comb = new ArrayList<>();
            comb.add(new HashSet<>(Arrays.asList("()")));
            comb.add(new HashSet<>(Arrays.asList("(())", "()()")));
            for (int i = 2; i < n; i++) {
                Set<String> temp = new HashSet<>();
                for(String s : comb.get(i-1)){
                    temp.add("("+s+")");
                }
                int l = 0;
                int r = i - 1;
                while (l <= r){
                    Set<String> left = comb.get(l);
                    Set<String> right = comb.get(r);
                    for(String a : left){
                        for(String b : right){
                            temp.add(a + b);
                            temp.add(b + a);
                        }
                    }
                    l += 1;
                    r -= 1;
                }
                comb.add(temp);
            }
            return new ArrayList<>(comb.get(n - 1));
        }
    }
}
