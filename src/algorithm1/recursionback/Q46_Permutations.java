package algorithm1.recursionback;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q46_Permutations {
    class Solution {
        List<List<Integer>> answer;
        public List<List<Integer>> permute(int[] nums) {
            answer = new ArrayList<>();
            Deque<Integer> numQue = new LinkedList<>();
            for(int n : nums){
                numQue.add(n);
            }
            perm(numQue, new LinkedList<>(), nums.length);
            return answer;
        }
        public void perm(Deque<Integer> numQue, LinkedList<Integer> permList, int length){
            if(permList.size() == length){
                answer.add(new ArrayList<>(permList));
                return;
            }
            int size = numQue.size();
            for (int i = 0; i < size; i++) {
                permList.add(numQue.poll());
                perm(numQue, permList, length);
                numQue.addLast(permList.removeLast());
            }
        }
    }
}
