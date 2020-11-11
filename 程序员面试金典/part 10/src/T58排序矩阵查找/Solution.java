package T58排序矩阵查找;

/**
 * https://leetcode-cn.com/problems/sorted-matrix-search-lcci/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0)    return false;
        int col = matrix[0].length;
        int x = 0;
        int y = col - 1;
        while(x < row && y >= 0){
            if(target < matrix[x][y])   y--;
            else if(target > matrix[x][y])   x++;
            else    return true;
        }
        return false;
    }
}