package Q2替换空格;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */

class Solution {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer();
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c != ' ') res.append(c);
            else res.append("%20");
        }
        return res.toString();
    }
}