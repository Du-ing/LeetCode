package T2删除字符串中的所有相邻重复项;

public class Solution {
    public String removeDuplicates(String S) {
        //栈解决
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < S.length(); i++){
            sb.append(S.charAt(i));
            while(sb.length() > 1 && sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2)){
                sb.delete(sb.length() - 2,sb.length());
            }
        }
        return sb.toString();
    }
}
