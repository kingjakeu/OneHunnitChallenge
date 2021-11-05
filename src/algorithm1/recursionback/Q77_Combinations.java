package algorithm1.recursionback;

import java.util.*;

public class Q77_Combinations {
    class Solution {
        List<List<Integer>> answer;
        public List<List<Integer>> combine(int n, int k) {
            answer = new ArrayList<>();
            comb(0, new ArrayList<>(), n, k);
            return answer;
        }
        public void comb(int start, List<Integer> combList, int n, int k){
            if(combList.size() == k){
                answer.add(new ArrayList<>(combList));
                return;
            }
            for (int i = start; i < n; i++) {
                combList.add(i + 1);
                comb(i + 1, combList, n, k);
                combList.remove(combList.size() - 1);
            }
        }
    }
}
