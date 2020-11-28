package Q19树的子结构;

/**
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null)
            return false;
        if(A.val == B.val){
            if(isChild(A,B))
                return true;
        }
        if(A.left != null){
            if(isSubStructure(A.left,B))
                return true;
        }
        if(A.right != null){
            if(isSubStructure(A.right,B))
                return true;
        }
        return false;
    }

    boolean isChild(TreeNode a,TreeNode b){
        if(b == null) return true;
        if(a == null) return false;
        if(a.val != b.val)  return false;
        return isChild(a.left,b.left) && isChild(a.right,b.right);
    }
}