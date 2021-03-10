package practice1;

//http://oj.saikr.com/contest/9/problem/B

public class Solution1 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 13930; i <= 457439; i++){
            if (solve(i)){
                num++;
            }
        }
        System.out.println(num);
    }

    public static boolean solve(int n){
        int min = n % 10;
        int a = min;
        n /= 10;
        while(true){
            if(Math.abs(a - n % 10) > 7){
                return false;
            }
            if(n / 10 == 0){
                if (Math.abs(min - n) > 2){
                    return true;
                }else {
                    return false;
                }
            }
            a = n % 10;
            n /= 10;
        }
    }
}
