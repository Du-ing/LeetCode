package T56搜索旋转数组;

/**
 * https://leetcode-cn.com/problems/search-rotate-array-lcci/
 */

class Solution {
    public int search(int[] arr, int target) {
        int a = 0;
        int b = arr.length - 1;
        
        while(a <= b){
            int mid = (a + b)/2;
            if(arr[a] < arr[mid]){ //中间<最左，所以左边非升序，右边升序
                if(target >= arr[a] && target <= arr[mid]){
                    b = mid;
                }else{
                    a = mid + 1;
                }
            }
            else if(arr[a] > arr[mid]){ //中间>最左，所以左边升序，右边非升序
                if(target >= arr[a] || target <= arr[mid]){
                    b = mid;
                }else{
                    a = mid + 1;
                }
            }
            else{ //中间=最左，所以左边连续相等（22222）或者左边出现断续（2342222）这样的情况
                /*if(target != arr[mid]){
                    a = mid + 1;
                }*/
                if(target != arr[a]){ //解决特殊情况
                    a++;
                }else{
                    return a;
                }
            }
        }
        return -1;
    }
}