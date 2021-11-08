package algorithm1.dp;

import java.util.ArrayList;
import java.util.List;

public class Q120_Triangle {
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int depth = triangle.size();
            List<Integer> last = triangle.get(0);

            for (int i = 1; i < depth; i++) {
                List<Integer> current = triangle.get(i);
                List<Integer> temp = new ArrayList<>();
                temp.add(current.get(0) + last.get(0));
                temp.add(current.get(1) + last.get(0));
                for (int j = 1; j < last.size(); j++) {
                    temp.set(j, Math.min(current.get(j) + last.get(j), temp.get(j)));
                    temp.add(current.get(j+1) + last.get(j));
                }
                last = temp;
            }
            int answer = Integer.MAX_VALUE;
            for(int i : last){
                answer = Math.min(answer, i);
            }
            return answer;
        }
    }
}
