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
    int mindiff=Integer.MAX_VALUE;
    int a=Integer.MAX_VALUE/2;
    int b=Integer.MIN_VALUE/2;
    public int minDiffInBST(TreeNode root) {
        if(root==null) return mindiff;
        minDiffInBST(root.left);
        a=b;
        b=root.val;
        mindiff=Math.min(mindiff,Math.abs(a-b));
        minDiffInBST(root.right);
        return mindiff;
    }
}