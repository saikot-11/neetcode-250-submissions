/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        Node left = checkBalance(root.left);
        Node right = checkBalance(root.right);

        return left.isBalanced && right.isBalanced && Math.abs(left.height - right.height) <= 1;
    }

    private Node checkBalance (TreeNode root) {
        if (root == null) {
            return new Node(true, 0);
        }

        Node left = checkBalance(root.left);
        Node right = checkBalance(root.right);

        boolean isBalanced = left.isBalanced && right.isBalanced && Math.abs(left.height - right.height) <= 1;

        Node curr = new Node(isBalanced, 1 + Math.max(left.height, right.height));

        return curr;
    }

    class Node {
        public boolean isBalanced = false;
        public int height = 0;

        public Node (boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }
}
