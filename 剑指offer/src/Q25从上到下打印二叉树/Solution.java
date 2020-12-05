package Q25从上到下打印二叉树;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 */

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        solve(queue,0,1);
        
        int len = queue.size();
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            res[i] = queue.get(i).val;
        }
        return res;
    }

    //k表示某层在队列中开始的位置，n表示该层节点个数
    void solve(ArrayList<TreeNode> queue,int k,int n){
        int n1 = 0; //记录加入的节点个数
        for(int i = 0; i < n; i++){
            TreeNode node = queue.get(k + i);
            if(node.left != null){
                queue.add(node.left);
                n1++;
            }
            if(node.right != null){
                queue.add(node.right);
                n1++;
            }
        }
        if(n1 == 0) return;
        else solve(queue,k + n,n1);
    }
}