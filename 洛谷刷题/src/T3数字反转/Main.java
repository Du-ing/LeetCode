package T3数字反转;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        StringBuffer sb = new StringBuffer(x);
        System.out.println(sb.reverse());
    }
}
