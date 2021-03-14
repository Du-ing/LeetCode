package 比赛;

import java.util.Scanner;

public class 神仙爱采药 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        String s = scanner.next();

        if (s.length() == 0 || v == 0){
            System.out.print(0);
        }else {
            int[] x = new int[s.length()];
            int num = 0;
            long sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int a = Integer.valueOf(s.charAt(i) - '0');
                if (v >= a){
                    x[num] = a;
                    v -= a;
                    num++;
                    sum += num;
                }else {
                    if (a == 1){
                        boolean f = true;
                        for (int j = 0; j < s.length(); j++){
                            if (x[j] == 2){
                                x[j] = 1;
                                v++;
                                sum += num;
                                f = false;
                                break;
                            }
                        }
                        if (f){
                            sum += num;
                        }
                    }else {
                        sum += num;
                    }
                }
            }
            System.out.print(sum);
        }
    }
}
