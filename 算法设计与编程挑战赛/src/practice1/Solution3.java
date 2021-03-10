package practice1;

//http://oj.saikr.com/contest/9/problem/F

public class Solution3 {
    public static void main(String[] args) {
        long sum = 1;
        long num = 1;
        for (int i = 1; i < 30; i++) {
            num = (num * (num + 5)) % 1000000007;
            sum = (sum + num) % 1000000007;
        }
        System.out.println(sum);
    }
}
