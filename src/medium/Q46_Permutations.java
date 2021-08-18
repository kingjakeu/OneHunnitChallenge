package medium;

import java.util.ArrayList;
import java.util.List;

public class Q46_Permutations {
    class Solution {
        List<List<Integer>> comb;
        public List<List<Integer>> permute(int[] nums) {
            comb = new ArrayList<>();
            perm(0, nums, new ArrayList<>());
            return comb;
        }

        public void perm(int idx, int[] nums, List<Integer> current){
            int length = nums.length;
            int size = current.size();
            if(size == length){
                comb.add(new ArrayList<>(current));
                return;
            }
            for (int i = 0; i < length - size; i++) {
                List<Integer> temp = new ArrayList<>(current);
                if(idx + i < length){
                    temp.add(nums[idx + i]);
                    perm(idx + i + 1, nums, temp);
                }else{
                    temp.add(nums[idx + i - length]);
                    //perm(idx + i + 1, nums, temp);
                }
            }
        }
    }
}
