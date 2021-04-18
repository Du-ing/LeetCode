package H3验证二叉搜索树;

/**
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * DFS，中序遍历树
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    long max = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(root.val <= max){
            return false;
        }
        max = root.val;
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
    }
}