package Q39在排序数组中查找数字01;

/**
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int k = -1;
        //二分查找定位大概位置
        while(start <= end){
            int mid = (start + end) / 2;
            if(target == nums[mid]){
                k = mid;
                break;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        //没找到返回0
        if(k == -1) return 0;

        //找到了，继续找具体区间
        start = k;
        end = k;
        while(nums[start] == target){
            start--;
            if(start == -1)
                break;
        }
        while(nums[end] == target){
            end++;
            if(end == nums.length)
                break;
        }
        return end - start - 1;
    }
}