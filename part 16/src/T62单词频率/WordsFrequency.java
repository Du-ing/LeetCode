package T62单词频率;

/**
 * https://leetcode-cn.com/problems/words-frequency-lcci/
 */

import java.util.HashMap;
import java.util.Map;

class WordsFrequency {

    Map<String, Integer> map;

    public WordsFrequency(String[] book) {
        map = new HashMap<>();
        for(String str : book){
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                int t = map.get(str);
                map.replace(str,t+1);
            }
        }
    }

    public int get(String word) {
        if(map.containsKey(word))   return map.get(word);
        return 0;
    }
}

/**
 * Your WordsFrequency object will be instantiated and called as such:
 * WordsFrequency obj = new WordsFrequency(book);
 * int param_1 = obj.get(word);
 */