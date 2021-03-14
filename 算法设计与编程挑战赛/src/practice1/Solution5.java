package practice1;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[t];
        int[] k = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = scanner.nextInt();
            k[i] = scanner.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.println(Gk(n[i],k[i]));
        }
    }

    public static int Gk(int n,int k){
        if (n == 0){
            return 0;
        }
        if (k == 1){
            return f(g(n));
        }else if (k > 1 && k % 2 == 0){
            return g(Gk(n,k - 1));
        }
        return f(Gk(n,k - 1));
    }

    public static int g(int n){
        int res = 0;
        for(int i = 1; i <= (n + 1)/2; i++){
            if (n % i == 0){
                res += f(n / i);
            }
        }
        return res;
    }

    public static int f(int n){
        if (n == 1){
            return 1;
        }
        int res = 0;
        for(int i = 1; i <= n - 1; i++){
            res += isGcd(i, n - i);
        }
        return res;
    }

    public static int isGcd(int x, int y){
        int a = Math.min(x,y);
        int b = Math.max(x,y);
        for (int i = 2; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
