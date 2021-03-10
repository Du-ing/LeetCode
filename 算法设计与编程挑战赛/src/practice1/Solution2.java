package practice1;

//http://oj.saikr.com/contest/9/problem/D

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            String res = String.format("%.1f ",solve(scanner.next()));
            System.out.print(res);
        }
    }

    public static double solve(String str){
        double k = 0;
        double time = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '.'){
                if(k >= 0.5){
                    k -= 0.5;
                    time += 0.5;
                }else if(k > 0){
                    time += 1 - k;
                    k = 0;
                }else{
                    time += 1;
                }
            }else if (c == 'w'){
                if(k >= 1){
                    k -= 1;
                    time += 1;
                }else if(k > 0){
                    time += 2 - k;
                    k = 0;
                }else{
                    time += 2;
                }
            }else if (c == '>'){
                time += 0.5;
                k = 4.5;
            }else if (c == 's'){
                if(k >= 1.5){
                    k -= 1.5;
                    time += 1.5;
                }else if(k > 1){
                    time += 3 - k;
                    k = 0;
                }else{
                    time += 2;
                }
            }else if (c == 'm'){
                if(k >= 2.5){
                    k -= 2.5;
                    time += 2.5;
                }else if(k > 2){
                    time += 5 - k;
                    k = 0;
                }else{
                    time += 3;
                }
            }
        }
        return time;
    }
}
