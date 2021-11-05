package algorithm1.recursionback;

import java.util.ArrayList;
import java.util.List;

public class Q784_LetterCasePermutation {
    class Solution {
        List<String> answer;
        public List<String> letterCasePermutation(String s) {
            answer = new ArrayList<>();
            compute(s.toCharArray(), s.toCharArray(), 0 , s.length());
            return answer;
        }
        public void compute(char[] currArr, char[] ogCharArr, int start, int end){
            if(start == end){
                answer.add(String.valueOf(currArr));
                return;
            }
            compute(currArr, ogCharArr, start + 1, end);
            if(ogCharArr[start] >= 'a' && ogCharArr[start] <= 'z'){
                char tmp = currArr[start];
                currArr[start] = (char)(currArr[start] - 32);
                compute(currArr, ogCharArr, start + 1, end);
                currArr[start] = tmp;
            } else if(ogCharArr[start] >= 'A' && ogCharArr[start] <= 'Z'){
                char tmp = currArr[start];
                currArr[start] = (char)(currArr[start] + 32);
                compute(currArr, ogCharArr, start + 1, end);
                currArr[start] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println((char)('a' - 32));
    }
}
