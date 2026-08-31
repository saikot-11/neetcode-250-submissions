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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stck = new Stack<>();
        TreeNode curr = root;
        
        while (curr != null || !stck.isEmpty()) {
            if (curr != null) {
                res.add(curr.val);
                stck.push(curr);
                curr = curr.right;
            } else {
                curr = stck.pop();
                curr = curr.left;
            }
        }

        Collections.reverse(res);

        return res;
    }
}