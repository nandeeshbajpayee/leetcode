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
    int max=0;
    int count=1;
    Integer prev=null;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        mode(root);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void mode(TreeNode root){
        if(root==null) return ;
        mode(root.left);
        if(prev!=null){
            if(prev==root.val){
                count++;
            }
            else count=1;
        }
        if(count>max){
            max=count;
            list.clear();
            list.add(root.val);
        }
        else if(max==count){
            list.add(root.val);
        }
        prev=root.val;
        mode(root.right);
    }
}