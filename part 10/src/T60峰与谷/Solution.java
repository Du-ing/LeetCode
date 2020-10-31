package T60峰与谷;

/**
 * https://leetcode-cn.com/problems/peaks-and-valleys-lcci/
 */

class Solution {
    public void wiggleSort(int[] nums) {
        //默认第一个元素为峰
        for(int i=1; i<nums.length; i++){
//            //谷
//            if(i % 2 != 0 && nums[i] > nums[i-1]){
//                int t = nums[i];
//                nums[i] = nums[i-1];
//                nums[i-1] = t;
//            }
//            //峰
//            else if(i % 2 == 0 && nums[i] < nums[i-1]){
//                int t = nums[i];
//                nums[i] = nums[i-1];
//                nums[i-1] = t;
//            }

            if((i % 2 != 0 && nums[i] > nums[i-1]) || (i % 2 == 0 && nums[i] < nums[i-1])){
                int t = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = t;
            }
        }
    }
}