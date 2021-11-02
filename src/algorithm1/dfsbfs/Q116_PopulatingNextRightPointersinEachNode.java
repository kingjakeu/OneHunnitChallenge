package algorithm1.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class Q116_PopulatingNextRightPointersinEachNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    class Solution {
        public Node connect(Node root) {
            if(root != null){
                Queue<Node> que = new LinkedList<>();
                que.add(root);
                find(que);
            }
            return root;
        }

        public void find(Queue<Node> que){
            Queue<Node> newQue = new LinkedList<>();
            while(!que.isEmpty()){
                Node node = que.poll();
                if(node.left != null) newQue.add(node.left);
                if(node.right != null) newQue.add(node.right);
                if(que.peek() != null) node.next = que.peek();
            }
            if(!newQue.isEmpty()){
                find(newQue);
            }
        }
    }
}
