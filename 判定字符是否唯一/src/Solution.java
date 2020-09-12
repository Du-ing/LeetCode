import java.util.ArrayList;

public class Solution {
    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
