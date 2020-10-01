package T29后继者;

/**
 * https://leetcode-cn.com/problems/successor-lcci/
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    private TreeNode next;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        next = null;
        findNext(root,p);
        return next;
    }

    private void findNext(TreeNode node, TreeNode p){
        if (node.left != null){
            inorderSuccessor(node.left,p);
        }
        if (next != null)   return;
        if (node.val > p.val){
            next = node;
            return;
        }
        if (node.right != null){
            inorderSuccessor(node.right,p);
        }
    }
}