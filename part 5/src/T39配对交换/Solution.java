package T39配对交换;

/**
 * https://leetcode-cn.com/problems/exchange-lcci/
 */

class Solution {
    public static int exchangeBits(int num) {
        int odd = num & 0x55555555;     //取出奇数位
        int even = num & 0xaaaaaaaa;    //取出偶数位
        odd = odd << 1;     //奇数位左移
        even = even >> 1;   //偶数位右移
        return odd | even;  //相或得结果
    }
}