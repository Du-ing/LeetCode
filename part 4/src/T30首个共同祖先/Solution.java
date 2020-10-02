package T30首个共同祖先;

/**
 * https://leetcode-cn.com/problems/first-common-ancestor-lcci/submissions/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node1 = null;
        TreeNode node2 = null;
        if (root.left != null){
            node1 = lowestCommonAncestor(root.left,p,q);
        }
        if (root.right != null){
            node2 = lowestCommonAncestor(root.right,p,q);
        }
        if (node1 != null && node2 != null || (root == p || root == q)) return root;
        if (node1 != null && node2 == null) return node1;
        if (node1 == null && node2 != null) return node2;
        return null;
    }
}