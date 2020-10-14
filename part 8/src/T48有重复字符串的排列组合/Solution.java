package T48有重复字符串的排列组合;

/**
 * https://leetcode-cn.com/problems/permutation-ii-lcci/
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String[] permutation(String S) {
        int n = S.length();

        int len = 1;
        for (int i = 1; i <= n; i++) {
            len *= i;
        }

        char[] chars = S.toCharArray();
        String[] res = new String[len];
        int k = 0;
        StringBuilder sb = new StringBuilder();
        dfs(chars,k,0,n,sb,res);
        //截取结果数组，去掉后面所有的null
        int i = 0;
        while(true){
            if(i == res.length || res[i] == null)   break;
            i++;
        }
        return Arrays.copyOf(res,i);
    }

    private int dfs(char[] chars,int k,int num,int n,StringBuilder sb,String[] res){
        int newNum = num;
        if (k == n){
            res[num] = sb.toString();
            newNum += 1;
        }else {
            //集合存储遍历过的元素避免重复
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (chars[i] != '0' && set.add(c)) {
                    sb.append(c);
                    chars[i] = '0';
                    newNum = dfs(chars, k + 1, newNum, n, sb, res);
                    //回溯
                    sb.deleteCharAt(sb.length() - 1);
                    chars[i] = c;
                }
            }
        }
        return newNum;
    }
}