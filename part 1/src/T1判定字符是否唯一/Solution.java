package T1判定字符是否唯一;

/**
 * https://leetcode-cn.com/problems/is-unique-lcci/
 */
public class Solution {
    public boolean isUnique(String astr) {
//        暴力法
//        char[] chars = astr.toCharArray();
//        for(int i=0;i<chars.length-1;i++){
//            for(int j=i+1;j<chars.length;j++){
//                if(chars[i]==chars[j]){
//                    return false;
//                }
//            }
//        }
//        return true;

        int len = astr.length();
        if(len <= 1){
            return true;
        }
        else{
            for(int i=0;i<len;i++){
                char c = astr.charAt(i);
                if(astr.indexOf(c) != astr.lastIndexOf(c)){
                    return false;
                }
            }
            return true;
        }
    }
}
