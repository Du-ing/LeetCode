/**
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 */
class Solution {
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<length;i++) {
            if(S.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(S.charAt(i));
            }
        }
        return  sb.toString();
    }
}