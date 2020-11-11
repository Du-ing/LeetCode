package T52堆箱子;

/**
 * https://leetcode-cn.com/problems/pile-box-lcci/
 */

import java.util.Arrays;

class Solution {
    public int pileBox(int[][] box) {
        //先将box数组排序
        Arrays.sort(box, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            if (a[2] != b[2]) {
                return a[2] - b[2];
            }
            return 0;
        });

        int len = box.length;
        int dp[] = new int[len];

        dp[0] = box[0][2];
        int res = dp[0];
        for(int i = 1; i<len; i++){
            //只放第i个箱子
            dp[i] = box[i][2];
            for(int j=0; j<i; j++){
                if(box[i][0] > box[j][0] && box[i][1] > box[j][1] && box[i][2] > box[j][2]){
                    dp[i] = dp[j]+box[i][2] > dp[i] ? dp[j]+box[i][2] : dp[i];
                }
            }
            res = dp[i] > res ? dp[i] : res;//取所有dp中的最大值
        }
        return res;
    }
}