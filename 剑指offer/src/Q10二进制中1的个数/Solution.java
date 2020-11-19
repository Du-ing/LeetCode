package Q10二进制中1的个数;

/**
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n & 1; //获取二进制末尾的值
            n = n >>> 1; //无符号右移，左边以0补充
        }
        return res;
    }
}