package 比赛;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class 但更爱字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

//        Stack<Character> stack = new Stack<>();
        LinkedList<Integer> queue = new LinkedList<>();

        StringBuffer res = new StringBuffer();
        boolean f = true;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (f){
                if (c >= 'A' && c <= 'Z'){
                    f = false;
                    queue.push(i);
                }else if(c >= 'a' && c <= 'z'){
                    if (queue.size() >= 2){
                        int start = queue.getFirst();
                        int end = queue.getLast();
                        while (!queue.isEmpty()){
                            res.append(str.charAt(queue.pop()));
                        }
                        res.append(" (" + str.substring(start,end) + ") " + c);
                    }else if (queue.size() == 1){
                        int start = queue.getFirst();
                        while (!queue.isEmpty()){
                            res.append(str.charAt(queue.pop()));
                        }
                        res.append(str, start, i);
                    }
                    f = false;
                }
            }else {
                if (c == ' '){
                    f = true;
//                    res.append(c);
                }
            }
        }

        System.out.println(res.toString());
    }
}
