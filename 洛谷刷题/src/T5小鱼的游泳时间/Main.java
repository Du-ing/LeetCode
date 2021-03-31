package T5小鱼的游泳时间;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int n = (c - a) * 60 + d - b;
        int h = n / 60;
        int m = n % 60;
        System.out.println(h + " " + m);
    }
}
