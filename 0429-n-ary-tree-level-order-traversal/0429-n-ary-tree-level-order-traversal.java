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
            int size=que.size();
            while(size-->0){
                Node node=que.poll();
                list.add(node.val);
                for(Node childnode : node.children ) que.offer(childnode);
            }
            res.add(list);
        }
        
        return res;    
    }
}