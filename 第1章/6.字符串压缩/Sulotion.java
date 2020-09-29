/**
 * https://leetcode-cn.com/problems/compress-string-lcci/submissions/
 */
class Solution {
    public String compressString(String S) {
        int S_len = S.length();
        if (S_len <= 2){
            return S;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        int len = 1;
        int num = 1;
        for (int i = 1; i < S_len; i++) {
            if (S.charAt(i) == S.charAt(i-1)){
                len++;
            }else {
                sb.append(len); num++;
                if (num >= S_len){
                    return S;
                }
                sb.append(S.charAt(i)); num++;
                if (num >= S_len){
                    return S;
                }
                len = 1;
            }
            if (i == S_len - 1){
                sb.append(len);
            }
        }
        return sb.toString();
    }
}