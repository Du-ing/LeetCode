package Q48数组中数字出现的次数2;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
 */

import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            if(map.containsKey(x)){
                int n = map.get(x);
                if(n == 2)
                    map.remove(x);
                else
                    map.replace(x, n + 1);
            }else{
                map.put(x, 1);
            }
        }
        return map.keySet().toArray(new Integer[1])[0];
    }
}