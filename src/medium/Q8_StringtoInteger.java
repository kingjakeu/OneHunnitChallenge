package medium;

public class Q8_StringtoInteger {
    class Solution {
        public int myAtoi(String s) {
            int sign = 0;
            char[] arr = s.toCharArray();
            int length = arr.length;
            int ret = 0;
            int i = 0;
            while (i < length && !(arr[i] >= '0' && arr[i] <='9')){
                if(arr[i] == '+' || arr[i] == '-'){
                    sign = arr[i] == '+' ? 1 : -1;
                    break;
                } else if(arr[i] != ' '){
                    return 0;
                }
                i += 1;
            }
            while (i < length && arr[i] >= '0' && arr[i] <='9'){
                int n = ret * 10 + (arr[i] - '0');
                if(n < ret){
                    if(sign >= 0) return Integer.MAX_VALUE;
                    return Integer.MIN_VALUE;
                }
                if((n - (arr[i] - '0') )/ 10 != ret){
                    if(sign >= 0) return Integer.MAX_VALUE;
                    return Integer.MIN_VALUE;
                }
                ret = n;
                i += 1;
            }
            if(sign >= 0) return ret;
            return ret * -1;
        }
    }
}
