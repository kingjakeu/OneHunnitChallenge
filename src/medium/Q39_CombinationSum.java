package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q39_CombinationSum {
    static class Solution {
        List<List<Integer>> answer;
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            answer = new ArrayList<>();
            find(0, candidates, target, new ArrayList<>());
            return answer;
        }
        public void find(int idx, int[] can, int target, List<Integer> comb){
            int sum = 0;
            for(int c: comb){
                sum += c;
            }
            while(idx < can.length) {
                if(sum + can[idx] == target){
                    List<Integer> temp = new ArrayList<>(comb);
                    temp.add(can[idx]);
                    answer.add(temp);
                }else if(sum + can[idx] < target){
                    List<Integer> temp = new ArrayList<>(comb);
                    temp.add(can[idx]);
                    find(idx, can, target, temp);
                }
                idx += 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,3,5};
        s.combinationSum(arr, 8);
    }
}
