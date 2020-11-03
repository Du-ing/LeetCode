package T64井字游戏;

/**
 * https://leetcode-cn.com/problems/tic-tac-toe-lcci/
 */

class Solution {

    private boolean f;  //标记平局或者未结束

    public String tictactoe(String[] board) {
        f = true;
        int len = board.length;
        boolean f1 = true;   //记录两个对角线
        boolean f2 = true;
        char c1 = board[0].charAt(0);   //遍历的起点
        char c2 = board[0].charAt(len-1);
        for(int i=0; i<len; i++){
            if(board[i].charAt(i) != ' '){
                if(board[i].charAt(i) != c1)   f1 = false;
                if(board[i].charAt(len-1-i) != c2)  f2 = false;
                if(check(board,len,i))   return String.valueOf(board[i].charAt(i));
            }
            else   f = false;
        }
        if((f1 || f2) && (c1 != ' ' || c2 != ' ')){
            return String.valueOf(f1?c1:c2);
        }
        return f?"Draw":"Pending";
    }

    //检查行和列
    private boolean check(String[] board,int len,int x){
        char str = board[x].charAt(x);
        boolean flag1 = true;
        boolean flag2 = true;
        for(int j=0; j<len; j++){
            if(board[x].charAt(j) != str){
                flag1 = false;
                if(board[x].charAt(j) == ' ')    f = false;
            }
            if(board[j].charAt(x) != str){
                flag2 = false;
                if(board[j].charAt(x) == ' ')    f = false;
            }
        }
        return flag1 || flag2;
    }
}