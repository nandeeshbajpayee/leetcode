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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        insert(root, val);
        return root;

    }
    public TreeNode insert(TreeNode root, int val) {
        if(val>=root.val) {
            if(root.right==null) {
               TreeNode newNode = new TreeNode(val);
                root.right=newNode;
                return root;
            }
            else insert(root.right,val);
        }
        else if(val<=root.val) {
            if(root.left==null) {
                TreeNode newNode = new TreeNode(val);
                root.left=newNode;
                return root;
            }
            else insert(root.left,val);
        }
        return root;
    }
}