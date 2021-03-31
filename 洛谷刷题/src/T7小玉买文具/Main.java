package T7小玉买文具;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n = a * 10 + b;
        System.out.println(n / 19);
    }
}
