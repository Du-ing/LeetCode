package T43魔术索引;

/**
 * https://leetcode-cn.com/problems/magic-index-lcci/
 */

class Solution {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i)   return i;
            if (nums[i] > i)    i = nums[i] - 1;    //跳跃
        }
        return -1;
    }
}