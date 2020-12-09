package Q29二叉树中和为某一值的路径;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        dfs(res,list,root,0,sum);
        return res;
    }

    void dfs(List<List<Integer>> res,LinkedList<Integer> list,TreeNode node,int k,int sum){
        if(node == null) return;
        list.offer(node.val);
        k += node.val;
        if(k == sum && node.left == null && node.right == null){
            res.add(new LinkedList(list));
        }
        dfs(res,list,node.left,k,sum);
        dfs(res,list,node.right,k,sum);
        list.removeLast(); //回溯
    }
}