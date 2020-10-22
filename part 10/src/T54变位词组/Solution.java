package T54变位词组;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/group-anagrams-lcci/
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String t = new String(chars);
            System.out.println(t);
            if(map.containsKey(t)){
                map.get(t).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(t,list);
            }
        }
        for(List list : map.values()){
            res.add(list);
        }
        return res;
    }
}