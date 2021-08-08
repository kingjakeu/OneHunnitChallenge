package easy;

import java.util.HashMap;
import java.util.Map;

public class Q169_MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for(int n : nums){
                if(hashMap.containsKey(n)){
                    hashMap.put(n, hashMap.get(n) + 1);
                }else{
                    hashMap.put(n, 1);
                }
            }
            int max = 0;
            int key = 0;
            for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
                if(entry.getValue() > max){
                    key = entry.getKey();
                    max = entry.getValue();
                }
            }
            return key;
        }
    }
}
