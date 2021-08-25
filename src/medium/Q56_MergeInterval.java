package medium;

import java.util.*;

public class Q56_MergeInterval {
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, new Comparator<>() {
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            LinkedList<Node> answerList = new LinkedList<>();
            for(int[] interval: intervals){
                if(answerList.isEmpty()){
                    answerList.add(new Node(interval[0], interval[1]));
                }else{
                    Node last = answerList.getLast();
                    if(last.start <= interval[0] && last.end >= interval[0] && last.end < interval[1]){
                        answerList.getLast().end = interval[1];
                    }else if(last.end < interval[0] && last.end < interval[1]){
                        answerList.add(new Node(interval[0], interval[1]));
                    }
                }
            }
            int[][] answer = new int[answerList.size()][2];
            for(int[] a : answer){
                Node node = answerList.removeFirst();
                a[0] = node.start;
                a[1] = node.end;
            }
            return answer;
        }
    }
    class Node{
        int start;
        int end;
        Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
