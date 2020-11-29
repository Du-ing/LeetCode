package Q20二叉树的镜像;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.right = mirrorTree(root.left);
        node.left = mirrorTree(root.right);
        return node;
    }
}