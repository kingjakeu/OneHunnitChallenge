package algorithm1.bitmanipulation;

public class Q191_Numberof1Bits {
    public class Solution {
        public int hammingWeight(int n) {
            int num = n;
            int count = 0;
            for (int i = 0; i < 32; i++) {
                int tmp = num;
                num = num >> 1;
                num = num << 1;
                if(num != tmp){
                    count += 1;
                }
                num = num >> 1;
            }
            return count;
        }
    }
}
