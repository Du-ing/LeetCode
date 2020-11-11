package T50颜色填充;

/**
 * https://leetcode-cn.com/problems/color-fill-lcci/
 */

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oriColor = image[sr][sc];
        //初始颜色如果和新颜色不相同才填充
        if(oriColor != newColor){
            int row = image.length;
            int col = image[0].length;
            dfs(sr,sc,image,row,col,oriColor,newColor);
        }
        return image;
    }

    private void dfs(int x,int y,int[][] image,int row,int col,int oriColor,int newColor){
        //越界或者已遍历过或者颜色与初始不同则结束
        if(x<0 || x>=row || y<0 || y>=col || image[x][y] != oriColor){
            return;
        }
        image[x][y] = newColor;
        dfs(x-1,y,image,row,col,oriColor,newColor);
        dfs(x+1,y,image,row,col,oriColor,newColor);
        dfs(x,y-1,image,row,col,oriColor,newColor);
        dfs(x,y+1,image,row,col,oriColor,newColor);
    }
}