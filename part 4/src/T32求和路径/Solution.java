package T32求和路径;
/**
 * https://leetcode-cn.com/problems/paths-with-sum-lcci/
 */

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    private int ways = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null)   return 0;
        ArrayList<Integer> queue = new ArrayList<Integer>();
        findWay(root,sum,queue);
        return ways;
    }

    private void findWay(TreeNode node,int sum,ArrayList<Integer> queue){
        ArrayList<Integer> queue1 = new ArrayList<Integer>();
        for (int i = 0; i < queue.size(); i++) {
            int t = queue.get(i) + node.val;
            if (t == sum)   ways++;
            queue1.add(t);
        }
        if (node.val == sum)    ways++;
        queue1.add(node.val);

        if (node.left != null) findWay(node.left,sum,queue1);
        if (node.right != null) findWay(node.right,sum,queue1);
    }
}