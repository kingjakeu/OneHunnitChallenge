package medium;

import java.util.*;

public class Q15_3Sum {
     class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            Set<Integer> set = new HashSet<>();
            List<List<Integer>> ans = new ArrayList<>();
            int length = nums.length;
            for (int i = 0; i < length - 2; i++) {
                if (!set.contains(nums[i])) {
                    int s = i + 1;
                    int e = length - 1;
                    while (s < e) {
                        int n = nums[i] + nums[s] + nums[e];
                        if (n == 0) {
                            ans.add(Arrays.asList(nums[i], nums[s], nums[e]));
                        }
                        if (n <= 0) {
                            while (s + 1 <= e && nums[s] == nums[s + 1]) {
                                s += 1;
                            }
                            s += 1;
                        }
                        if (n >= 0) {
                            while (s <= e - 1 && nums[e] == nums[e - 1]) {
                                e -= 1;
                            }
                            e -= 1;

                        }
                    }
                }
                set.add(nums[i]);
            }
            return ans;
        }
    }
}
