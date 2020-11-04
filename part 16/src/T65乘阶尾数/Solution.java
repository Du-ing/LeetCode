package T65乘阶尾数;

/**
 * https://leetcode-cn.com/problems/factorial-zeros-lcci/
 */

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n >= 5){
            n /= 5;
            count += n;
        }
        return count;
    }
}