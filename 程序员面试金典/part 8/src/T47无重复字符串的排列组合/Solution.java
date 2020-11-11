package T47无重复字符串的排列组合;

/**
 * https://leetcode-cn.com/problems/permutation-i-lcci/
 */

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
        return res;
    }

    private int dfs(char[] chars,int k,int num,int n,StringBuilder sb,String[] res){
        int newNum = num;
        if (k == n){
            res[num] = sb.toString();
            newNum += 1;
        }else {
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (chars[i] != '0') {
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