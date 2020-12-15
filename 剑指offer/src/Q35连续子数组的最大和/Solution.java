package Q35连续子数组的最大和;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i - 1] + nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}