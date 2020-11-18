package Q10剪绳子;

/**
 * https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 */

class Solution {
    public int cuttingRope(int n) {
        int[] flag = new int[n+1];
        flag[2] = 1;
        dp(flag,n);
        return flag[n];
    }

    private void dp(int[] flag,int k){
        if(k == 2) return;
        dp(flag,k-1);
        int max = flag[k-1];
        for(int i=1; i<k-1; i++){
            int t = Math.max(k-i,flag[k-i]);
            max = Math.max(max,t*i);
        }
        flag[k] = max;
    }
}