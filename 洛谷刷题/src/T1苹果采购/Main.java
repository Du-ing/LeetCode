package T1苹果采购;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        long stus = scanner.nextInt();
        long res = num * stus;
        System.out.println(res);
    }
}
