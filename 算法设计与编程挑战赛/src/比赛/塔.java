package 比赛;

public class 塔 {
    public static void main(String[] args) {
        for (int i = 1; i <= 26; i++){
            for (int f = 1; f <= 26 - i; f++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print((char) ('A' + k));
            }
            for (int k = i - 2; k >= 0; k--){
                System.out.print((char) ('A' + k));
            }
            System.out.print('\n');
        }
    }
}
