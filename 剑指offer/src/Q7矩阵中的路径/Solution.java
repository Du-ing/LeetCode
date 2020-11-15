package Q7矩阵中的路径;

/**
 * https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        //匹配第一个字符
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == words[0]){
                    //第一个字符匹配正确且字符串就这一个字符则直接结束
                    if(words.length == 1) return true;
                    //字符串长度>1，需要进行后续的匹配，回溯
                    char temp = board[i][j];
                    board[i][j] = ' ';
                    if(dfs(board,i-1,j,words,1) || dfs(board,i+1,j,words,1) || dfs(board,i,j-1,words,1) || dfs(board,i,j+1,words,1)) return true;
                    board[i][j] = temp;
                }
            }
        }
        return false;
    }

    //匹配后续的字符
    private boolean dfs(char[][] board,int x,int y,char[] words,int index){
        //超出边界则返回
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
        boolean flag = false;
        if(board[x][y] == (words[index])){
            //匹配完成
            if(index == words.length-1) flag = true;
            //匹配还未完成，继续下一轮
            else{
                //需要回溯
                char temp = board[x][y];
                board[x][y] = ' ';
                flag = dfs(board,x-1,y,words,index+1) || dfs(board,x+1,y,words,index+1) || dfs(board,x,y-1,words,index+1) || dfs(board,x,y+1,words,index+1);
                board[x][y] = temp;
            }
        }
        return flag;
    }
}