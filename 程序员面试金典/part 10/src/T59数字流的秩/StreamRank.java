package T59数字流的秩;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/rank-from-stream-lcci/
 */

class StreamRank {

    private List<Integer> list;

    public StreamRank() {
        list = new ArrayList<Integer>();
    }

    public void track(int x) {
        if(list.size() == 0 || list.get(list.size()-1) <= x){
            list.add(x);
        }else{
            for(int i=list.size()-1; i>=0; i--){
                int t = list.get(i);
                if(t <= x)  break;
                if(i == list.size()-1)  list.add(t);
                else list.set(i+1,t);
                list.set(i,x);
            }
        }
        //System.out.println(list);
    }

    public int getRankOfNumber(int x) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > x){
                return i;
            }
        }
        return list.size();
    }
}

/**
 * Your StreamRank object will be instantiated and called as such:
 * StreamRank obj = new StreamRank();
 * obj.track(x);
 * int param_2 = obj.getRankOfNumber(x);
 */