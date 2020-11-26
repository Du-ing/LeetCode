package Q17调整数组顺序使奇数位于偶数前面;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */

class Solution {
    public int[] exchange(int[] nums) {
        int low = 0;
        int high = nums.length  - 1;
        
        while(low < high){
            while(low < high && nums[low] % 2 == 1){
                low++;
            }
            while(low < high && nums[high] % 2 == 0){
                high--;
            }
            if(low < high){
                int t = nums[low];
                nums[low] = nums[high];
                nums[high] = t;
            }   
        }
        return nums;
    }
}