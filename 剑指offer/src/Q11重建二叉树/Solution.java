package Q11重建二叉树;

/**
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0,0,inorder.length - 1,preorder,inorder);
    }

    private TreeNode build(int pre,int start,int end,int[] preorder,int[] inorder){
        if(pre > preorder.length - 1 || start > end) return null;
        TreeNode node = new TreeNode(preorder[pre]);
        
        int i = start;
        while(i <= end){
            if(inorder[i] == preorder[pre]) break;
            i++;
        }

        node.left = build(pre+1,start,i - 1,preorder,inorder);
        node.right = build(pre+i-start+1,i + 1,end,preorder,inorder);
        return node;
    }
}