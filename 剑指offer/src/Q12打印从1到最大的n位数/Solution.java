package Q12打印从1到最大的n位数;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */

class Solution {
    public int[] printNumbers(int n) {
        int k = (int)Math.pow(10,n) - 1;
        int[] res = new int[k];
        for(int i=1; i<=k; i++){
            res[i-1] = i;
        }
        return res;
    }
}