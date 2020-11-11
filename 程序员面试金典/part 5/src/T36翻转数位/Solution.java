package T36翻转数位;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/reverse-bits-lcci/
 */

class Solution {
    public static int reverseBits(int num) {
        String str = Integer.toBinaryString(num);
        char[] chars = str.toCharArray();
        int max = 0;
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '0'){
                flag = false;
                chars[i] = '1';
                //分割
                StringBuilder temp = new StringBuilder();
                for (char c : chars) {
                    temp.append(c);
                }
                String[] split = temp.toString().split("0");
                for (String s : split) {
                    if (s.length() > max)   max = s.length();
                }
                chars[i] = '0';
            }
        }
        if (flag){
            if (chars.length == 32) return chars.length;
            return chars.length+1;
        }
        return max;
    }
}