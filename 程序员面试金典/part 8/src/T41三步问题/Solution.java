package T41三步问题;

/**
 * https://leetcode-cn.com/problems/three-steps-problem-lcci/
 */

class Solution {

//    private int[] list = new int[1000000];

    public int waysToStep(int n) {
//        if(n > 0 && list[n] != 0)   return list[n];
//        if(n == 0 || n == 1)  return 1;
//        else if(n < 0)  return 0;
//        list[n] = ((waysToStep(n - 1)+waysToStep(n - 2)) % 1000000007 +waysToStep(n - 3)) % 1000000007;
//        return list[n];

        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        int[] list = new int[n+1];
        list[1] = 1;
        list[2] = 2;
        list[3] = 4;
        for (int i = 4; i <= n; i++){
            list[i] = ((list[i - 1]+list[i - 2]) % 1000000007+list[i - 3]) % 1000000007;
        }
        return list[n];
    }
}