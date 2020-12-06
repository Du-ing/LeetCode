package Q26从上到下打印二叉树2;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        bfs(queue,res,1);
        return res;
    }

    void bfs(LinkedList<TreeNode> queue,List<List<Integer>> res,int n){
        List<Integer> list = new ArrayList<>();
        int n1 = 0;
        for(int i = 0; i < n; i++){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
                n1++;
            }
            if(node.right != null){
                queue.offer(node.right);
                n1++;
            }
        }
        res.add(list);
        if(n1 == 0) return;
        bfs(queue,res,n1);
    }
}