package leetcode.opu.practice;

import java.util.ArrayList;
import java.util.List;
// 1382. Balance a Binary Search Tree
public class Balance_BST {
    class Solution {
        List<Integer> itemList;

        public TreeNode balanceBST(TreeNode root) {
            if (root == null) return root;
            itemList = new ArrayList();
            traverseInOrder(root);
            return constructNewBST(this.itemList, 0, this.itemList.size() - 1);
        }

        private void traverseInOrder(TreeNode root) {
            if (root == null) return;
            traverseInOrder(root.left);
            this.itemList.add(root.val);
            traverseInOrder(root.right);
        }

        private TreeNode constructNewBST(List<Integer> list, int start, int end) {
            if (start > end) {
                return null;
            }
            int mid = start + (end - start) / 2;
            TreeNode root = new TreeNode(list.get(mid));
            root.left = constructNewBST(list, start, mid - 1);
            root.right = constructNewBST(list, mid + 1, end);
            return root;
        }

    }
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }
