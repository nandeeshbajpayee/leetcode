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
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        nodes(root);
        int minvalue=Integer.MAX_VALUE;
        Collections.sort(list);  
        for(int i=0;i<list.size()-1;i++){
            int absmin=Math.abs(list.get(i)-list.get(i+1));
            if(absmin<minvalue) minvalue=absmin;
        }
        return minvalue;
    }
    public void nodes(TreeNode root) {
        if(root==null) return;
        list.add(root.val);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
    }
}