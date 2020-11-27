package Q18二维数组中的查找;

/**
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if(n == 0) return false;
        int m = matrix[0].length;
        int x = 0;
        int y = m - 1;

        while(true){
            if(x >= n || y < 0){
                return false;
            }
            if(target < matrix[x][y]){
                y -= 1;
            }else if(target > matrix[x][y]){
                x += 1;
            }else{
                return true;
            }
        }
    }
}