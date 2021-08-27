package medium;

import java.util.*;

public class Q128_LongestConsecutiveSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> numSet = new HashSet<>();
            for(int n : nums){
                numSet.add(n);
            }
            List<Integer> start = new ArrayList<>();
            for(int n : numSet){
                if(!numSet.contains(n-1)){
                    start.add(n);
                }
            }
            int answer = 0;
            for(int s : start){
                int count = 1;
                int tmp = s + 1;
                while (numSet.contains(tmp)){
                    tmp += 1;
                    count += 1;
                }
                answer = Math.max(answer, count);
            }
            return answer;
        }
    }
}
