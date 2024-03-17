package 문자열;

import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        int count = scanner.nextInt();

        String s = scanner.next();
        String[]sp = s.split("");

        for(String a:sp){
            answer += (Integer.parseInt(a));
        }
        System.out.println(answer);
    }
}
