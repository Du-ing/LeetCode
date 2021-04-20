package H5不同路径;

/**
 * https://leetcode-cn.com/problems/unique-paths/
 * dp数组
 */

class Solution {
    public int uniquePaths(int m, int n) {
//        int[][] x = new int[m][n];
//
//        for(int j = 0; j < n; j++){
//            x[0][j] = 1;
//        }
//        for(int i = 0; i < m; i++){
//            x[i][0] = 1;
//        }
//        for(int i = 1; i < m; i++){
//            for(int j = 1; j < n; j++){
//                x[i][j] = x[i-1][j] + x[i][j-1];
//            }
//        }
//        return x[m-1][n-1];

        /**
         * 控件优化
         * m*n --> n
         */
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                x[j] = x[j] + x[j-1];
            }
        }
        return x[n-1];
    }
}