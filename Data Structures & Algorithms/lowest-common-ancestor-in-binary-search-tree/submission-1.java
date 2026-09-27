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
  * Space Complexity: O(n)
  */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }

        if (root == p) {
            return root;
        }

        if (root == q) {
            return root;
        }

        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);

        if (min <= root.val && max >= root.val) {
            return root;
        }

        if (min <= root.val && max <= root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return lowestCommonAncestor(root.right, p, q);
    }
}
