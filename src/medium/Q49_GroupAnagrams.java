package medium;

import java.util.*;

public class Q49_GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> wordMap = new HashMap<>();
            for(String s : strs){
                char[] temp = s.toCharArray();
                Arrays.sort(temp);
                String key = String.valueOf(temp);
                if(!wordMap.containsKey(key)){
                    wordMap.put(key, new ArrayList<>());
                }
                wordMap.get(key).add(s);
            }
            List<List<String>> answer = new ArrayList<>();
            for(Map.Entry<String, List<String>> entry : wordMap.entrySet()){
                answer.add(entry.getValue());
            }
            return answer;
        }
    }
}
