package T55硬币;

/**
 * https://leetcode-cn.com/problems/coin-lcci/
 */

class Solution {
    public int waysToChange(int n) {
        int dp[] = new int[n + 1];
        int[] coins = {1, 5, 10, 25};
        dp[0] = 1;
        for(int coin : coins){
            for(int i = coin; i <= n; i++){
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }
        return dp[n];
    }
}