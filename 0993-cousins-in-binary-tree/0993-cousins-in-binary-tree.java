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
       public boolean isCousins(TreeNode root, int x, int y) {
           if(root==null) return false;
           Queue<TreeNode> queue = new LinkedList<>();
           queue.offer(root);
           while(!queue.isEmpty()){
               int size = queue.size();
               boolean right=false;
               boolean left=false;
               for(int i=0;i<size;i++){
                   TreeNode node=queue.poll();
                   if(node.left!=null && node.right!=null){
                       if(node.left.val==x && node.right.val==y) return false;
                       if(node.right.val==x && node.left.val==y) return false;
                   }
                   if(node.val==x) right=true;
                   if(node.val==y) left=true;
                   if(node.left!=null) queue.offer(node.left);
                   if(node.right!=null) queue.offer(node.right);
               }
               if(left==true && right ==true) return true;
           }
           return false;
    }
}