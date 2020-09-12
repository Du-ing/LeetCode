import java.util.Arrays;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        //思路：用统计学，统计两个字符串每一个字母出现的次数，最后进行对比
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            int[] num1 = new int[26];
            int[] num2 = new int[26];
            for (int i=0;i<s1.length();i++){
                char c1 = s1.charAt(i);
                num1[c1 - 'a']++;
                char c2 = s2.charAt(i);
                num2[c2 - 'a']++;
            }
            for (int i=0;i< num1.length;i++){
                if(num1[i] != num2[i]){
                    return false;
                }
            }
            return true;
        }

//        //大佬写的，重排法
//        char[] c1=s1.toCharArray();
//        Arrays.sort(c1);
//        char[] c2=s2.toCharArray();
//        Arrays.sort(c2);
//        return new String(c1).equals(new String(c2));
    }
}
