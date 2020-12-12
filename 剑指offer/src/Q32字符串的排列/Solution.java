package Q32字符串的排列;

/**
 * https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 */

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public String[] permutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        char[] c = s.toCharArray();
        dfs(res,c,0,s.length());
        return res.toArray(new String[res.size()]);
    }

    void dfs(ArrayList<String> res,char[] c,int k,int len){
        if(k == len - 1){ //得到一个序列
            String s = String.valueOf(c);
            res.add(s);
            return;
        }
        HashSet<Character> set = new HashSet<>(); //用set来避免重复字母换位
        for(int i = k; i < len; i++){
            if(set.add(c[i])){ //避免重复字母换位
                swap(c,k,i); //交换
                dfs(res,c,k + 1,len);
                swap(c,k,i); //回溯
            }
        }
    }

    void swap(char[] c,int a,int b){
        char t = c[a];
        c[a] = c[b];
        c[b] = t;
    }
}