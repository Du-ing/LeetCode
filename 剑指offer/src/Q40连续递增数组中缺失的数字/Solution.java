package Q40连续递增数组中缺失的数字;

/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */

class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        int b = nums.length - 1;
        while(a <= b){
            int mid = (a + b) / 2;
            if(mid == nums[mid]){
                a = mid + 1;
            }else{
                b = mid - 1;
            }
        }
        return a;
    }
}