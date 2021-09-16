package medium;

import java.util.*;

public class Q146_LRUCache {
    class LRUCache {
        private Map<Integer, Integer> map;
        private LinkedHashSet<Integer> cache;
        private int capacity;
        public LRUCache(int capacity) {
            this.cache = new LinkedHashSet<>();
            this.map = new HashMap<>();

            this.capacity = capacity;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                cache.remove(key);
                cache.add(key);
                return map.get(key);
            }
            return -1;
        }

        public void put(int key, int value) {
            cache.remove(key);
            cache.add(key);
            if(cache.size() > capacity){
                for(int c : cache){
                    cache.remove(c);
                    map.remove(c);
                    break;
                }
            }
            map.put(key, value);
        }
    }
}
