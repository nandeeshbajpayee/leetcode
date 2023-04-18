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
public class Solution {
    
    int minvalue = Integer.MAX_VALUE;
    int prev= Integer.MAX_VALUE/2;
    public int getMinimumDifference(TreeNode root) {
        minimum(root);
        return minvalue;
    }
    
    public void minimum(TreeNode root) {
        if (root == null) return;
        minimum(root.left);
        minvalue= Math.min(minvalue, Math.abs(root.val - prev));
        prev = root.val;
        minimum(root.right);
    }

}
