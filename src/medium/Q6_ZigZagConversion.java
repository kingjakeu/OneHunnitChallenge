package medium;

public class Q6_ZigZagConversion {
    class Solution {
        public String convert(String s, int numRows) {
            int length = s.length();
            int interval =  2 * (numRows -1);
            if(numRows == 1) interval = 1;

            int maxOff = (numRows - 2) * 2;
            int minOff = 2;
            int offset = maxOff + 2;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j <= length / numRows; j++) {
                    int idx = i + (j * interval);
                    if(idx < length) {
                        sb.append(s.charAt(idx));
                    }
                    if(offset <= maxOff && offset >= minOff){
                        if(idx + offset < length){
                            sb.append(s.charAt(idx + offset));
                        }
                    }

                }
                offset -= 2;
            }
            return sb.toString();
        }
    }
}
