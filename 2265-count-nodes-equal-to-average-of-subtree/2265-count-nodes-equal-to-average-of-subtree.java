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
    private int matchingNodeCount = 0;
    public int averageOfSubtree(TreeNode root) {
        postOrderTraversal(root);
        return matchingNodeCount;
    }
    private int[] postOrderTraversal(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] leftMetrics = postOrderTraversal(node.left);
        int[] rightMetrics = postOrderTraversal(node.right);
        int currentSum = leftMetrics[0] + rightMetrics[0] + node.val;
        int currentCount = leftMetrics[1] + rightMetrics[1] + 1;
        if (node.val == currentSum / currentCount) {
            matchingNodeCount++;
        }
        return new int[]{currentSum, currentCount}; 
    }
}