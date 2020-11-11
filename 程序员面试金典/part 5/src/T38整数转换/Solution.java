package T38整数转换;

/**
 * https://leetcode-cn.com/problems/convert-integer-lcci/
 */

class Solution {
    public int convertInteger(int A, int B) {
        //异或
        int flag = A^B;
        int count = 0;
        //统计1的个数
        while (flag != 0){
            flag &= flag-1;
            count++;
        }
        return count;
    }
}