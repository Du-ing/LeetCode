package T25最小高度树;

/**
 * https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sort(nums,0, mid-1);
        root.right = sort(nums,mid+1,nums.length-1);
        return root;
    }

    private TreeNode sort(int[] nums,int start,int end){
        int mid = (end + start)/2;
        if (start > end){
            return null;
        }else {
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sort(nums,start,mid-1);
            node.right = sort(nums,mid+1,end);
            return node;
        }
    }
}