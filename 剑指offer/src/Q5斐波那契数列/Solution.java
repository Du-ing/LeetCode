package Q5斐波那契数列;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */

class Solution {
    public int fib(int n) {
        int[] flag = new int[n+1];
        return dp(n,flag);
    }

    private int dp(int n,int[] flag){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        flag[n] = flag[n] == 0 ? (dp(n-2,flag) + dp(n-1,flag))%1000000007 : flag[n];
        return flag[n];
    }
}