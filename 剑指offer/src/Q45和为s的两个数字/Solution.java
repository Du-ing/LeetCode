package Q45和为s的两个数字;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int a = 0;
        int b = nums.length - 1;
        while(a < b){
            int sum = nums[a] + nums[b];
            if(sum == target){
                res[0] = nums[a];
                res[1] = nums[b];
                break;
            }else if(sum < target){
                a++;
            }else{
                b--;
            }
        }
        return res;
    }
}