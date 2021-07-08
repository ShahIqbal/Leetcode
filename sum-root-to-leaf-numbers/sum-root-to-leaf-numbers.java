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
    int total = 0;
    
    public int sumNumbers(TreeNode root) {
        sumNumbersRecursive(root, 0, this.total);
        return total;
    }
    
    public void sumNumbersRecursive(TreeNode root, int count, int total) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            this.total = this.total + count*10 + root.val; 
        }
        count = count*10 + root.val;
        sumNumbersRecursive(root.left, count, this.total);
        sumNumbersRecursive(root.right, count, this.total);
    }
}