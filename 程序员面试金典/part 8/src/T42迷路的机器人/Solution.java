package T42迷路的机器人;

/**
 * https://leetcode-cn.com/problems/robot-in-a-grid-lcci/
 */

import java.util.ArrayList;
import java.util.List;

class Solution {

    private boolean flag;

    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length - 1;
        int c = obstacleGrid[0].length - 1;
        flag = false;
        List<List<Integer>> res = new ArrayList<>();
        dp(obstacleGrid,0,0,r,c,res);
        if (obstacleGrid[r][c] == 1 || !flag){
            res.clear();
        }
        return res;
    }

    private void dp(int[][] obstacleGrid,int x,int y,int r,int c,List<List<Integer>> res){
        if (flag || obstacleGrid[x][y] == -1 || obstacleGrid[x][y] == 1)   return;
        if (x == r && y == c){
            List<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            res.add(list);
            flag = true;
            return;
        }
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        res.add(list);
        obstacleGrid[x][y] = -1;
        if (y+1 <= c)   dp(obstacleGrid,x,y + 1,r,c,res);
        if (x+1 <= r)   dp(obstacleGrid,x + 1,y,r,c,res);
        if (!flag && res.size() > 0)  res.remove(res.size()-1);
    }
}