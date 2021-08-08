package easy;

import java.util.ArrayList;
import java.util.List;

public class Q448_FindAllNumbersDisappearedinanArray {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int length = nums.length;
            boolean[] check = new boolean[length];
            for(int n : nums){
                check[n-1] = true;
            }
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                if(!check[i]) ans.add(i+1);
            }
            return ans;
        }
    }
}
