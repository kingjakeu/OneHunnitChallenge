package medium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q89_GrayCode {
    class Solution {
        public List<Integer> grayCode(int n) {
            List<Integer> numList = new LinkedList<>();
            numList.add(0);
            numList.add(1);
            for (int i = 0; i < n-1; i++) {
                LinkedList<Integer> newList = new LinkedList<>();
                for(int j : numList){
                    newList.add(j);
                }
                Collections.reverse(numList);
                for(int j : numList){
                    newList.add((int) (j + Math.pow(2, i+1)));
                }
                numList = newList;
            }
            return numList;
        }
    }
}
