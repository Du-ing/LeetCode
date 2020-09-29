/**
 * https://leetcode-cn.com/problems/special-positions-in-a-binary-matrix/
 */
class Solution01 {
    public int numSpecial(int[][] mat) {
        int num = 0;
        for(int i=0;i< mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                int flag = 1;
                if(mat[i][j] == 1){
                    for (int k=j+1;k<mat[i].length;k++){
                        if(mat[i][k] == 1){
                            flag = 0;
                            break;
                        }
                    }
                    if(flag == 1){
                        for(int p=0;p< mat.length;p++){
                            if(mat[p][j] == 1 && p != i){
                                flag = 0;
                                break;
                            }
                        }
                    }
                    num += flag;
                    break;
                }
            }
        }
        return num;
    }
}
