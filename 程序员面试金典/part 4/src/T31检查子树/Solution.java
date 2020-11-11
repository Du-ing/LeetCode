package T31检查子树;
/**
 * https://leetcode-cn.com/problems/check-subtree-lcci/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1.val == t2.val){
            if (isSame(t1,t2))
                return true;
        }
        if (t1.left != null){
            if (checkSubTree(t1.left,t2))
                return true;
        }
        if (t1.right != null){
            if (checkSubTree(t1.right,t2))
                return true;
        }
        return false;
    }

    private boolean isSame(TreeNode a,TreeNode b){
        if (a == null && b == null) return true;
        if (a == null && b == null) return false;
        if (a.val != b.val) return false;
        return isSame(a.left,b.left) && isSame(a.right,b.right);
    }
}