package algorithm1.bitmanipulation;

public class Q190_ReverseBits {
    public class Solution {
        public int reverseBits(int n) {
            int num = n;
            int answer = 0;
            for (int i = 0; i < 32; i++) {
                int tmp = num;
                num = num >> 1;
                answer = answer << 1;
                if(tmp != num << 1){
                    answer += 1;
                }
            }
            return answer;
        }
    }
}
