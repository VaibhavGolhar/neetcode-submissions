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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        height(root, ans);
        return ans[0];
    }

    private static int height(TreeNode root, int[] ans){
        if (root == null) return 0;

        int leftDia = height(root.left, ans);
        int rightDia = height(root.right, ans);
        if (leftDia + rightDia > ans[0]) ans[0] = leftDia + rightDia;
        return 1 + Math.max(leftDia, rightDia);
    }
}