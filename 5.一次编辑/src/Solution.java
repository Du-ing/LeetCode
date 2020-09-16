/**
 * https://leetcode-cn.com/problems/one-away-lcci/submissions/
 */
class Solution {
    public boolean oneEditAway(String first, String second) {
//        分情况讨论
//        int len1 = first.length();
//        int len2 = second.length();
//        if (len1 == len2){
//            int flag = 0;
//            for (int i = 0; i < len1; i++) {
//                if(first.charAt(i) != second.charAt(i)){
//                    flag++;
//                    if (flag > 1){
//                        return false;
//                    }
//                }
//            }
//        }else if (len1 - len2 == 1){
//            if (len2 == 0){
//                return true;
//            }
//            int flag = 0;
//            for (int i = 0; i < len2; i++) {
//                if (first.charAt(i) != second.charAt(i - flag)){
//                    flag++;
//                    if (flag > 1){
//                        return false;
//                    }
//                }
//            }
//            if (flag == 1 && first.charAt(len1 - 1) != second.charAt(len2 - 1)){
//                return false;
//            }
//        }else if (len2 - len1 == 1){
//            if(len1 == 0){
//                return true;
//            }
//            int flag = 0;
//            for (int i = 0; i < len1; i++) {
//                if (second.charAt(i) != first.charAt(i - flag)){
//                    flag++;
//                    if (flag > 1){
//                        return false;
//                    }
//                }
//            }
//            if (flag == 1 && first.charAt(len1 - 1) != second.charAt(len2 - 1)){
//                return false;
//            }
//        }else if (Math.abs(len1 - len2) > 1){
//            return false;
//        }
//        return true;

        //双指针法（两者时间复杂度上一致）
        int len = first.length() - second.length();
        if(len > 1 || len < -1){
            return false;
        } else{
            int flag = 0;
            for (int i=0,j=0; i<first.length()&&j<second.length(); i++,j++){
                if (first.charAt(i) != second.charAt(j)){
                    if (len > 0){
                        i++;
                    }else if(len < 0){
                        j++;
                    }
                    flag++;
                }
            }
            if (flag > 1){
                return false;
            }
        }
        return true;
    }
}