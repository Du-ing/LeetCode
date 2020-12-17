package Q37第一个只出现一次的字符;

/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */

class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] nums = new int[26]; //记录每一个字符出现的次数
        for(int i = 0; i < chars.length; i++){ //统计
            nums[chars[i] - 'a']++;
        }
        for(int i = 0; i < chars.length; i++){ //找第一次出现一次的字符
            if(nums[chars[i] - 'a'] == 1){
                return chars[i];
            }
        }
        return ' ';
    }
}