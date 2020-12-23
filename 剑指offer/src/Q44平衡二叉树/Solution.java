package Q44平衡二叉树;

/**
 * https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/submissions/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    boolean flag;
    public boolean isBalanced(TreeNode root) {
        flag = true;
        dfs(root);
        return flag;
    }

    int dfs(TreeNode node){
        if(node == null || flag == false) return 0;
        int l = dfs(node.left);
        int r = dfs(node.right);
        if(Math.abs(l - r) > 1){
            flag = false;
            return 0;
        }
        return Math.max(l, r) + 1;
    }
}