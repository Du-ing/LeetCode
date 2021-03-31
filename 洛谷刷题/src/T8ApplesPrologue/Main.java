package T8ApplesPrologue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        double s = scanner.nextInt();

        if (t == 0){
            System.out.println(0);
        }else {
            int left = m - (int)Math.ceil(s / t);
            if (left < 0){
                left = 0;
            }
            System.out.println(left);
        }
    }
}
