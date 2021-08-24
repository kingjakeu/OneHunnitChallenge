package medium;

import java.util.ArrayList;
import java.util.List;

public class Q78_Subset {
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> answer = new ArrayList<>();
            answer.add(new ArrayList<>());
            for(int n : nums){
                answer = find(answer, n);
            }
            return answer;
        }
        public List<List<Integer>> find(List<List<Integer>> current, int num){
            List<List<Integer>> newList = new ArrayList<>();
            for(List<Integer> cur : current){
                newList.add(new ArrayList<>(cur));
                List<Integer> tmp = new ArrayList<>(cur);
                tmp.add(num);
                newList.add(tmp);
            }
            return newList;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution s = new Solution();
        List<List<Integer>> answer  = s.subsets(nums);
        for(List<Integer> ans : answer){
            for (int a : ans){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
