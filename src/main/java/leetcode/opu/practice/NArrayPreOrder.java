package leetcode.opu.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NArrayPreOrder {
    // 589. N-ary Tree Preorder Traversal
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    class Solution {
        List<Integer> result;

        public List<Integer> preorder(Node root) {
            result = new ArrayList();
            if (root == null) {
                return result;
            }
            Stack<Node> stack = new Stack();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node curr = stack.pop();
                result.add(curr.val);
                for (int i = curr.children.size() - 1; i >= 0; i--) {
                    stack.push(curr.children.get(i));
                }
            }
            return result;
        }
    }

// class Solution {
//     List<Integer> res;
//     public List<Integer> preorder(Node root) {
//         res = new ArrayList();
//         if(root == null) {
//             return res;
//         }
//         traverse(root);
//         return res;
//     }

//     private void traverse(Node node) {
//         if(node.children == null){
//             return;
//         }
//         res.add(node.val);
//         for(Node child: node.children) {
//             traverse(child);
//         }
//     }
// }
}
