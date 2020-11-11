package Q1数组中重复的数字;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */

class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] flag = new int[nums.length];
        for(int k : nums){
            if(flag[k] > 0) return k;
            else flag[k]++;
        }
        return 0;
    }
}