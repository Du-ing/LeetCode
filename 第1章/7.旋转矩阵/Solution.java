/**
 * https://leetcode-cn.com/problems/rotate-matrix-lcci/
 */
class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int n = len / 2;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < len - 1 - i; j++) {
                swap(matrix,i,j,len-1-j,i);
                swap(matrix,len-1-j,i,len-1-i,len-1-j);
                swap(matrix,len-1-i,len-1-j,j,len-1-i);
            }
        }
    }

    public static void swap(int[][] matrix,int i,int j,int i1,int j1){
        int t = matrix[i][j];
        matrix[i][j] = matrix[i1][j1];
        matrix[i1][j1] = t;
    }
}