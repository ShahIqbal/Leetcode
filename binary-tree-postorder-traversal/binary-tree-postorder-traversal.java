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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrderTrav(root);
        return list;
    }
    
    public void postOrderTrav(TreeNode root) {
        if(root == null) return;
        postOrderTrav(root.left);
        postOrderTrav(root.right);
        list.add(root.val);
    }
}