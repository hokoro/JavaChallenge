package 문자열;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String s;

        for(int i = 0; i < count; i++){
            s = scanner.next();
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(s.length()-1));
            System.out.println();
        }
    }
}
