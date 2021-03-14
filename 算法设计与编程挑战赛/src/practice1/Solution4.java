package practice1;

//http://oj.saikr.com/contest/9/problem/G

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextInt();
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long l = scanner.nextInt();
        long r = scanner.nextInt();

        long res = 0;
        long f1 = 1, f2 = 1;
        for(int i = 3; i <= l; i++){
            long m = (a * f2 + b * f1) % 1000000007;
            f1 = f2;
            f2 = m;
        }

        for (long i = l; i <= r; i++){
            long x = (solve(f2) / solve(k) % 1000000007) / solve(f2 - k);
            long m = (a * f2 + b * f1) % 1000000007;
            f1 = f2;
            f2 = m;
            res = (res + x) % 1000000007;
        }
        System.out.println(res);
    }

    public static long solve(long a){
        long num = 1;
        for (long i = 1; i <= a; i++){
            num = num * i % 1000000007;
        }
        return num;
    }
}
