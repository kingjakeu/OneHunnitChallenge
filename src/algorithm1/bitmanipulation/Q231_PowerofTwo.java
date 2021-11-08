package algorithm1.bitmanipulation;

public class Q231_PowerofTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return n > 0 && ((n - 1) & n) == 0;
        }
    }
}
