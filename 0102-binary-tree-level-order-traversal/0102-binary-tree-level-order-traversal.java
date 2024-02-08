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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) new ArrayList<>();
        
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        
        que.offer(root);
        
        List<List<Integer>> res=new ArrayList();
        if(root==null) return res;
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> list=new ArrayList<>();
            while(size-->0){
                TreeNode node=que.poll();
                if(node.left!=null) que.offer(node.left);
                if(node.right!=null) que.offer(node.right);
                list.add(node.val);
            }
            res.add(list);
        }
        return res;
        
    }
}