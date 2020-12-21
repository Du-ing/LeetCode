package Q42二叉树的深度;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    int dfs(TreeNode node, int k){
        return node == null ? k : Math.max(dfs(node.left, k + 1), dfs(node.right, k + 1));
    }
}