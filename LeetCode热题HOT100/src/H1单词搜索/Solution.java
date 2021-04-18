package H1单词搜索;

/**
 * https://leetcode-cn.com/problems/word-search/
 * 深度优先搜索、回溯算法
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        int len = word.length();
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
                if(search(board, word, x, y, 0, len) == len){
                    return true;
                }
            }
        }
        return false;
    }

    public int search(char[][] board, String word, int x, int y, int k, int len){
        if(k == len){
            return k;
        }
        if(x >= 0 && x < board.length && y >= 0 && y < board[0].length){
            if(board[x][y] != ' ' && board[x][y] == word.charAt(k)){
                char t = board[x][y];
                board[x][y] = ' ';
                int a = search(board, word, x + 1, y, k + 1, len);
                int b = search(board, word, x - 1, y, k + 1, len);
                int c = search(board, word, x, y + 1, k + 1, len);
                int d = search(board, word, x, y - 1, k + 1, len);
                k = Math.max(Math.max(a, b), Math.max(c, d));
                board[x][y] = t;
            }
        }
        return k;
    }
}