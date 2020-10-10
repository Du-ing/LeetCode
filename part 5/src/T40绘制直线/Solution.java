package T40绘制直线;

/**
 *https://leetcode-cn.com/problems/draw-line-lcci/
 */

class Solution {
    public int[] drawLine(int length, int w, int x1, int x2, int y) {
        int[] res = new int[length];
        int offset = y * w / 32;    //偏移量
        int first = x1 / 32 + offset;
        int last = x2 / 32 + offset;
        for(int i = first; i <= last; i++)     res[i] = -1;
        if (first != last){
            //处理起始位置
            res[first] = res[first] >>> (x1 % 32);
            //处理最后位置
            res[last] = Integer.MIN_VALUE >> (x2 % 32);
        }else {
            int head = res[first] >>> (x1 % 32);
            int tail = Integer.MIN_VALUE >> (x2 % 32);
            res[first] = head & tail;
        }
        return res;
    }
}