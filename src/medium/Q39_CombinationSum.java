package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q39_CombinationSum {
    class Solution {
        List<List<Integer>> answer;
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            answer = new ArrayList<>();
            find(candidates, target, new LinkedList<>());
            return answer;
        }
        public void find(int[] can, int target, LinkedList<Integer> comb){
            int sum = 0;
            for(int c: comb){
                sum += c;
            }

            for(int c : can){
                if(sum + c == target){
                    answer.add(new ArrayList<>(comb));
                }
                if(sum + c <  target){
                    comb.add(c);
                    find(can, target, comb);
                    comb.removeLast();
                }
            }
        }
    }
}
