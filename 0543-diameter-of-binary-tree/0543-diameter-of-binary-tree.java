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
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;
//         int left=diameterOfBinaryTree(root.left);
//         int right=diameterOfBinaryTree(root.right);
//         int head=height(root.left)+height(root.right) ;
//         return Math.max(head,Math.max(left,right));
//     }
//     public int height(TreeNode root){
//         if(root==null) return 0;
//         return Math.max(height(root.left),height(root.right))+1;
//     }
// }
class Solution {
    public int ans=0;
    public int height(TreeNode root) {
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        ans=Math.max(ans,left+right+1);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return ans-1;
    }
}