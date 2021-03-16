package T3螺旋矩阵2;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int k = 1;
        for(int i = 0; i < n / 2; i++){
            for(int j = i; j < n - i - 1; j++){
                a[i][j] = k++;
            }
            for(int j = i; j < n - i - 1; j++){
                a[j][n - i - 1] = k++;
            }
            for(int j = n - i - 1; j > i; j--){
                a[n - i - 1][j] = k++;
            }
            for(int j = n - i - 1; j > i; j--){
                a[j][i] = k++;
            }
        }
        if(n % 2 == 1){
            a[n / 2][n / 2] = n * n;
        }
        return a;
    }
}