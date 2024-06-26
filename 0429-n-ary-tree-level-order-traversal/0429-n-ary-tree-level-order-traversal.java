/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> list=new ArrayList<>();
            Queue<List<Node>> que2=new LinkedList<>();
            while(!que.isEmpty()){
                Node node=que.poll();
                list.add(node.val);
                que2.offer(node.children);
            }
            while(!que2.isEmpty()){
                List<Node> nodelist=que2.poll();
                
                for(Node node : nodelist) que.offer(node);
            }
            res.add(list);
        }
        
        return res;    
    }
}