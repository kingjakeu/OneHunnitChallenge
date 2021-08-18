package medium;

import java.util.LinkedList;
import java.util.Queue;

public class Q45_JumpGameII {
    class Solution {
        public int jump(int[] nums) {
            int length = nums.length;
            int[] jump = new int[length];
            for (int i = 0; i < length; i++) {
                for (int j = 1; j <= nums[i] && i + j < length; j++) {
                    jump[i + j] = jump[i + j] == 0 ? jump[i] +1 : Math.min(jump[i + j], jump[i] + 1);
                }
            }
            return jump[length - 1];
        }
        // faster
        public int jumpGreedy(int[] nums) {
            int length = nums.length;
            int answer = 0;
            int l = 0;
            int r = 0;
            while(r < length-1){
                int far = 0;
                for (int i = l; i <= r; i++) {
                    far = Math.max(far, i + nums[i]);
                }
                l = r + 1;
                r = far;
                answer += 1;
            }
            return answer;
        }
    }
}
