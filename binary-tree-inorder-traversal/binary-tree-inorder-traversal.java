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
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrderTrav(root);
        return list;
    }
    
    public void inOrderTrav(TreeNode root) {
        if(root == null) return;
        inOrderTrav(root.left);
        list.add(root.val);
        inOrderTrav(root.right);
    }
}