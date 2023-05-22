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
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        return  findTilt(root.left)+findTilt(root.right)+tilt(root);
    }
    public int sum(TreeNode root){
        if(root==null) return 0;
        return sum(root.left)+sum(root.right)+root.val;
    }
    public int tilt(TreeNode root){
        return Math.abs(sum(root.left)-sum(root.right));
    }
}