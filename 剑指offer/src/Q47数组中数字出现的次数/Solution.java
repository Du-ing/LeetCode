import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
 */

class Solution {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i], 1);
            }
        }

        int n = 0;
        for(int k : map.keySet()){
            res[n++] =k;
        }
        return res;
    }
}