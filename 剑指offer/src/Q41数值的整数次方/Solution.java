package Q41数值的整数次方;

/**
 * https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 */

class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(x == 1 || x == 0) return x;
        int m = Math.abs(n);
        double left = 1;
        //处理int最小值取相反数溢出的情况
        if(n == Integer.MIN_VALUE){
            m = Integer.MAX_VALUE;
            left *= x;
        }
        while(true){
            if(m == 1){
                break;
            }
            if(m % 2 == 1){
                left *= x;
            }
            x *= x;
            m /= 2;
        }
        return n > 0 ? x * left : 1 / (x * left);
    }
}