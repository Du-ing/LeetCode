package 比赛;

import java.util.Scanner;

public class 关于哥俩好的数字这件事 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        int[] a = new int[100000];
        int[] b = new int[100000];// 记录数位和
        int position = 1;
        while (true) {
            b[position] = func(position);
            a[b[position]]++;
            if (a[b[position]] == n) {
                int result = 0;
                for (int i = 1; i <= position; i++) {
                    if (b[i] == b[position]) {
                        System.out.println(i);
                        result += i;
                    }
                }
                System.out.println(result);
                break;
            }
            position++;

        }

    }

    public static int func(int a) {
        String s = String.valueOf(a);
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += s.charAt(i) - '0';
        }

        return result;

    }
}
