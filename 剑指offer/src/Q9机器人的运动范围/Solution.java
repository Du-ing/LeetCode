package Q9机器人的运动范围;

/**
 * https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 */

class Solution {
    public int movingCount(int m, int n, int k) {
        int res = 0;
        int[][] flag = new int[m][n];
        return dfs(flag,0,0,k);
    }

    private int dfs(int[][] flag,int x,int y,int k){
        //超出边界或已遍历过则返回0
        if(x < 0 || x >= flag.length || y < 0 || y >= flag[0].length || flag[x][y] != 0) return 0;
        //标记已遍历
        flag[x][y] = 1;
        //计算坐标各位数之和
        int sum = 0;
        int x1 = x;
        int y1 = y;
        while(x1 != 0 || y1 != 0){
            sum += (x1 % 10 + y1 % 10);
            x1 /= 10;
            y1 /= 10;
        }
        //位数之和大于k则返回0
        if(sum > k) return 0;
        //否则返回后续遍历的值在加上自身的1
        return 1+dfs(flag,x-1,y,k)+dfs(flag,x+1,y,k)+dfs(flag,x,y-1,k)+dfs(flag,x,y+1,k);
    }
}