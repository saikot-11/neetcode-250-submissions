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

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n) for recursion stack
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        Node temp = checkBalance(root);
        return temp.isBalanced;
    }

    private Node checkBalance(TreeNode root) {
        if (root == null) {
            return new Node(0, true);
        }

        Node left = checkBalance(root.left);
        Node right = checkBalance(root.right);

        boolean isBalance = left.isBalanced && right.isBalanced && Math.abs(left.height - right.height) <= 1;

        return new Node (1 + Math.max(left.height, right.height), isBalance);
    }
}

class Node {
    int height;
    boolean isBalanced;

    public Node (int height, boolean isBalanced) {
        this.height = height;
        this.isBalanced = isBalanced;
    }
}
