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
    List<List<Integer>> res=new ArrayList();
    List<Integer> list=new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
        if(root==null) return res;
        path(root,targetSum);
        return res;
    }
    void path(TreeNode root,int targetSum){
        if(root==null) return;
        list.add(root.val);
        if(targetSum==root.val && root.left==null && root.right==null) {
            res.add(new ArrayList(list));
        }
        path(root.left,targetSum-root.val);
        path(root.right,targetSum-root.val);
        list.remove(list.size()-1);
    }
}