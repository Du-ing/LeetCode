package Q6青蛙跳台阶问题;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */

class Solution {
    public int numWays(int n) {
        if(n == 0) return 1;
        int[] flag = new int[n+1];
        return dp(flag,n);
    }
    
    private int dp(int[] flag,int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(flag[n] == 0) flag[n] = (dp(flag,n-1) + dp(flag,n-2)) % 1000000007;
        return flag[n];
    }
}