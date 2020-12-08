package Q28二叉搜索树的后序遍历序列;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
 */

class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return solve(postorder,0,postorder.length - 1);
    }

    boolean solve(int[] postorder,int start,int end){
        if(start >= end) return true; //检查到底了，直接返回
        int root = postorder[end]; //当前根节点
        boolean flag = true;
        int k = start; //保存分界点
        while(postorder[k] < root && k < end){ //寻找左右子树的分界点
            k++;
        }
        for(int i = k + 1; i < end; i++){ //检查是否满足搜索二叉树规则
            if(postorder[i] < root){
                flag = false;
            }
        }
        //当前树满足，则继续检查它的左右子树；当前树不满足，直接返回错误，无需往下检查
        return flag ? solve(postorder,start,k - 1) && solve(postorder,k,end - 1) : false;
    }
}