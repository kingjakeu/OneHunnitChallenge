package easy;

import java.util.HashSet;
import java.util.Set;

public class Q136_SingleNumber {
    class Solution {
        Set<Integer> numSet = new HashSet<>();
        public int singleNumber(int[] nums) {
            for(int n : nums){
                if(numSet.contains(n)){
                    numSet.remove(n);
                }else{
                    numSet.add(n);
                }
            }
            return numSet.iterator().next();
        }
    }
}
