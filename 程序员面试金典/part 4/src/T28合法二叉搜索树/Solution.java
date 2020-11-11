/**
 * https://leetcode-cn.com/problems/legal-binary-search-tree-lcci/
 */
package T28合法二叉搜索树;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {

    private List<Integer> treeList;
    private boolean flag;

    public boolean isValidBST(TreeNode root) {
        if (root == null)   return true;
        treeList = new ArrayList<>();
        flag = true;
        preOrder(root);
//        int len = treeList.size();
//        for (int i = 1; i < len; i++) {
//            if (treeList.get(i) <= treeList.get(i-1)){
//                return false;
//            }
//        }
        return flag;
    }

    private void preOrder(TreeNode node){
        if (!flag)  return;
        if (node.left != null){
            preOrder(node.left);
        }
        if (treeList.get(treeList.size()-1) >= node.val){
            flag = false;
            return;
        }
        treeList.add(node.val);
        if (node.right != null){
            preOrder(node.right);
        }
    }
}