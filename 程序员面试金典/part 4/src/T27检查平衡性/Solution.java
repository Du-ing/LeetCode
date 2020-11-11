/**
 * https://leetcode-cn.com/problems/check-balance-lcci/
 */
package T27检查平衡性;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        if (Math.abs(deep(root.left) - deep(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int deep(TreeNode node){
        if (node == null){
            return 0;
        }
        return Math.max(deep(node.left),deep(node.right)) + 1;
    }
}