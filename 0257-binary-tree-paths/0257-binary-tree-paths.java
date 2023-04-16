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
    List<String> list=new ArrayList<>(); 
    public List<String> binaryTreePaths(TreeNode root) {
         return Paths(root,"");
    }
     public List<String> Paths(TreeNode root,String str){
         if(root==null) return list;
         str+=Integer.toString(root.val);
         Paths(root.left,str+"->");
         Paths(root.right,str+"->");
         if(root.left==null && root.right==null) list.add(str);
         return list;
     } 
}