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
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n) for recursion stack
     */
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        calculate(root);
        return diameter;
    }

    private int calculate(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = calculate(root.left);
        int right = calculate(root.right);
        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}
