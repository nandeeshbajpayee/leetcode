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
    public int value=0;
    public boolean flag=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Path(root,targetSum);
        return flag;
    }
    public void Path(TreeNode root, int target) {
        value+=root.val;
        if(root.left==null && root.right==null){
            if(value==target) flag=true;
            return ;
        }
        
        if(root.left!=null){
        Path(root.left,target);
        value-=root.left.val;    
        }
        if(root.right!=null){
        Path(root.right,target);
        value-=root.right.val;    
        }
    }
}