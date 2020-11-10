package T69跳水板;

/**
 * https://leetcode-cn.com/problems/diving-board-lcci/
 */

class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0) return new int[0];
        if(shorter == longer){
            int[] arr = new int[1];
            arr[0] = k * shorter;
            return arr;
        }
        int[] res = new int[k+1];
        int i = k;
        while(i >= 0){
            int t = shorter*i + longer*(k-i);
            res[k-i] = t;
            i--;
        }
        return res;
    }
}