package T63最大数值;

/**
 * https://leetcode-cn.com/problems/maximum-lcci/
 */

class Solution {
    public int maximum(int a, int b) {
        long k = ((long)a - (long)b) >> 63; //符号位
        return (int)((k+1) * a + (-k) * b);
    }
}