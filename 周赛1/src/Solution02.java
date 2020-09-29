/**
 * https://leetcode-cn.com/problems/count-unhappy-friends/
 */
class Solution02 {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int num = 0;
        for(int i=0;i< pairs.length;i++){
            int x = pairs[i][0];
            int y = pairs[i][1];
            num += isAdd1(i,x,y,preferences,pairs);
            num += isAdd1(i,y,x,preferences,pairs);
        }
        return num;
    }

    public int isAdd1(int i,int x,int y,int[][] preferences, int[][] pairs){
        for(int j=0;j< pairs.length;j++){
            int u = pairs[j][0];
            int v = pairs[j][1];
            if(isAdd2(i,j,x,y,u,v,preferences,pairs) == 1){
                return 1;
            }
            if(isAdd2(i,j,x,y,v,u,preferences,pairs) == 1){
                return 1;
            }
        }
        return 0;
    }

    public int isAdd2(int i,int j,int x, int y,int u,int v,int[][] preferences, int[][] pairs) {
        int a1 = 0;
        int a2 = 0;
        for (int i1 = 0; i1 < preferences[x].length; i1++) {
            if (preferences[x][i1] == u) {
                a1 = i1;
            } else if (preferences[x][i1] == y) {
                a2 = i1;
            }
        }
        int b1 = 0;
        int b2 = 0;
        for (int i1 = 0; i1 < preferences[u].length; i1++) {
            if (preferences[u][i1] == x) {
                b1 = i1;
            } else if (preferences[u][i1] == v) {
                b2 = i1;
            }
        }
        if (a1 < a2 && b1 < b2 && j != i) {
            return 1;
        }
        return 0;
    }
}
