package T49括号;

/**
 * https://leetcode-cn.com/problems/bracket-lcci/
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuffer str = new StringBuffer();
        str.append('(');
        dfs(1,0,n,str,res);
        return res;
    }

    private void dfs(int left,int right,int n,StringBuffer str,List<String> res){
        if(left == n && right == n){
            res.add(str.toString());
        }else{
            if(left < n){
                str.append('(');
                dfs(left+1,right,n,str,res);
                str.deleteCharAt(str.length()-1);//回溯
            }
            if(right < n && right < left){
                str.append(')');
                dfs(left,right+1,n,str,res);
                str.deleteCharAt(str.length()-1);//回溯
            }
        }
    }
}