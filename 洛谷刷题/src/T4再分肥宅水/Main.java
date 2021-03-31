package T4再分肥宅水;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        int n = scanner.nextInt();

        double x = t / n;
        System.out.println(String.format("%.3f", x));
        System.out.println(n * 2);
    }
}
