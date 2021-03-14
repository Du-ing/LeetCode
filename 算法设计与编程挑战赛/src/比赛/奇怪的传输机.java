package 比赛;

import java.util.Scanner;

public class 奇怪的传输机 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double l = n;
        boolean f = true;

        for (int i = 1; i <= y; i++){
            l = l * 2 / 3;
            if (i == x){
                l += n / 2;
                if (l >= n){
                    l = n;
                }
            }
            if (l < n / 32){
                System.out.println("N0!");
                System.out.print(String.format("%d %.6f",i,l));
                f = false;
                break;
            }
        }
        if (f){
            System.out.println("YE5!");
            System.out.print(String.format("%.6f",l));
        }
    }
}
