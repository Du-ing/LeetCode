package T34插入;

class Solution {
    public int insertBits(int N, int M, int i, int j) {
        int t = 0;
        //构造 00...11100，i到j位为1
        for(int k = i;k <= j;k++){
            t = t|(1<<k);
        }
        //构造11...00011，i到j位为0
        t = ~t;
        //将N的i~j位清零
        N = N&t;
        M = M<<i;
        //插入
        return N|M;
    }
}