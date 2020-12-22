package Q43二叉搜索树的第k大节点;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 */

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        find(root, list, k);
        return list.get(k - 1);
    }

    void find(TreeNode node, ArrayList<Integer> list, int k){
        if(node == null) return;
        find(node.right, list, k);
        //找到前k大节点，直接结束，无需再继续找了
        if(list.size() == k) return;
        list.add(node.val);
        find(node.left, list, k);
    }
}