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
    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }
    
    List<TreeNode> generate(int a, int b) {
        List<TreeNode> list = new ArrayList<>();
        if (a > b) {
            list.add(null);
            return list;
        }
        for (int i = a; i <= b; i++) {
            List<TreeNode> leftPossibles = generate(a, i - 1);
            List<TreeNode> rightPossibles = generate(i + 1, b);
            for (TreeNode lRoot : leftPossibles) {
                for (TreeNode rRoot : rightPossibles) {
                    TreeNode root = new TreeNode(i);
                    root.left = lRoot;
                    root.right = rRoot;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
