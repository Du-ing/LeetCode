/**
 * https://leetcode-cn.com/problems/palindrome-permutation-lcci/submissions/
 */
class Solution {
    public boolean canPermutePalindrome(String s) {
        int len = s.length();
        if(len % 2 == 0){
            for(int i=0;i<len;i++){
                int flag = 0;
                if (s.charAt(i) != ' '){
                    for (int j=0;j<len;j++){
                        if(s.charAt(j) == s.charAt(i)){
                            flag++;
                        }
                    }
                    s = s.replace(s.charAt(i),' ');
                    if (flag % 2 == 1){
                        return false;
                    }
                }
            }
        }else{
            int num = 0;
            for(int i=0;i<len;i++){
                int flag = 0;
                if (s.charAt(i) != ' '){
                    for (int j=0;j<len;j++){
                        if(s.charAt(j) == s.charAt(i)){
                            flag++;
                        }
                    }
                    s = s.replace(s.charAt(i),' ');
                    if (flag % 2 == 1){
                        num++;
                        if(num > 1){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
