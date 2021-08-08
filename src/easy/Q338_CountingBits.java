package easy;

public class Q338_CountingBits {
    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n+1];
            for (int i = 0; i < n+1; i++) {
                int t = i;
                while(t > 0){
                    ans[i] += (t%2);
                    t = t/2;
                }
            }
            return ans;
        }
    }
}
