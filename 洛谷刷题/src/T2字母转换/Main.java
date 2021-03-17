package T2字母转换;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char C = (char) ('A' + c - 'a');
        System.out.println(C);
    }
}
