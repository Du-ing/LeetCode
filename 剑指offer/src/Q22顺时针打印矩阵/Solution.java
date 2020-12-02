package Q22顺时针打印矩阵;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int n = matrix.length;
        if(n == 0){
            return new int[0];
        }
        
        int m = matrix[0].length;
        int[] res = new int[n * m];
        int f = 0;
        int len = n < m ? n : m;
        for(int i = 0; i < (len + 1) / 2; i++){
            //处理只剩中间一个元素的情况
            if(n * m - f == 1){
                res[f++] = matrix[n / 2][m / 2];
            }
            for(int k = i; k < m - 1 - i; k++){
                res[f++] = matrix[i][k];
            }
            for(int k = i; k < n - 1 - i; k++){
                res[f++] = matrix[k][m - 1 -i];
            }
            for(int k = m - 1 - i; k > i && f < n * m; k--){
                res[f++] = matrix[n - 1 - i][k];
            }
            for(int k = n - 1 - i; k > i && f < n * m; k--){
                res[f++] = matrix[k][i];
            }
        }
        return res;
    }
}