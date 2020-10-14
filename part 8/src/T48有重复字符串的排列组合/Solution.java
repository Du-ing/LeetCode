package T48有重复字符串的排列组合;

/**
 * https://leetcode-cn.com/problems/permutation-ii-lcci/
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String[] permutation(String S) {
        int n = S.length();
        char[] chars = S.toCharArray();
        Set<String> res = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        dfs(chars,0,n,sb,res);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(char[] chars, int k, int n, StringBuilder sb, Set<String> res){
        if (k == n){
            res.add(sb.toString());
        }else {
            //集合存储遍历过的元素避免重复
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                char c = chars[i];
                if (chars[i] != '0' && set.add(c)) {
                    sb.append(c);
                    chars[i] = '0';
                    dfs(chars, k + 1, n, sb, res);
                    //回溯
                    sb.deleteCharAt(sb.length() - 1);
                    chars[i] = c;
                }
            }
        }
    }
}