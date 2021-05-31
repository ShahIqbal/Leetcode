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
    TreeNode node = null;
    public TreeNode searchBST(TreeNode root, int val) {
        searchBSTVoid(root, val);
        return node;
    }
    
    public void searchBSTVoid(TreeNode root, int val) {
        if(root == null) return;
        
        searchBSTVoid(root.left, val);
        if(root.val == val) node = root;
        searchBSTVoid(root.right, val);
    }
}