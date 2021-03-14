package 比赛;

import java.util.Scanner;

public class 奇怪的小鸭子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int m = 1;
        for (; m <= A / a; m++){
            double num = (A - a * m) / (m + 1.0);
            if (num < a){
                break;
            }
        }

        int n = 1;
        for (; n <= B / b; n++){
            double num = (B - b * n) / (n + 1.0);
            if (num < b){
                break;
            }
        }

        System.out.println(m * n);
    }
}
