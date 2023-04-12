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
    public boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        check(root);
        return flag;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int lh=check(root.left);
        int rh=check(root.right);
        int value=Math.abs(lh-rh);
        if(value>1) flag=false;
        return Math.max(lh,rh)+1;
    }
}
