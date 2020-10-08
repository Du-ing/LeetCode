package T1反转字符串;

/**
 * https://leetcode-cn.com/problems/reverse-string/
 */

class Solution {
    public void reverseString(char[] s) {
        if(s == null || s.length == 0)   return;
        int front = 0;
        int behind = s.length - 1;
        while(front < behind){
            char t = s[front];
            s[front] = s[behind];
            s[behind] = t;
            front++;
            behind--;
        }
    }
}