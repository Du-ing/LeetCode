package T57稀疏数组搜索;

/**
 * https://leetcode-cn.com/problems/sparse-array-search-lcci/
 */

class Solution {
    public int findString(String[] words, String s) {
        int a = 0;
        int b = words.length - 1;
        while(a <= b){
            //找非空中间点
            int mid = (a + b) / 2;
            while(true){
                if(!words[mid].equals("") || mid <= a){ //注意mid <= a防止死循环
                    break;
                }
                mid--;
            }

            int flag = s.compareTo(words[mid]);
            if(flag == 0) return mid;
            else if(flag < 0) b = mid - 1;
            else a = mid + 1;
        }
        return -1;
    }
}