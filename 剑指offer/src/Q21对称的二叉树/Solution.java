package Q21对称的二叉树;

/**
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return check(root.left,root.right);
    }

    boolean check(TreeNode L,TreeNode R){
        if(L == null && R == null) return true;
        if(L == null || R == null || (L.val != R.val)) return false;
        return check(L.left,R.right) && check(L.right,R.left);
    }
}