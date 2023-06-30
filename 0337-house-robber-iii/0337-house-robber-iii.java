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
    public int rob(TreeNode root) {
        housePair res = robbing(root);
        int ans = Math.max(res.withrobbery, res.withoutrobbery);
        return ans;
    }

    public static class housePair {
        int withoutrobbery = 0;
        int withrobbery = 0;
    }

    housePair robbing(TreeNode root) {
        if (root == null)
            return new housePair();
        housePair left = robbing(root.left);
        housePair right = robbing(root.right);

        housePair ans = new housePair();

        ans.withrobbery = left.withoutrobbery + root.val + right.withoutrobbery;
        ans.withoutrobbery = Math.max(left.withoutrobbery, left.withrobbery) + Math.max(right.withoutrobbery, right.withrobbery);
        return ans;
    }
}
