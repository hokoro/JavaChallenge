package 문자열;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int i = scanner.nextInt();

        System.out.println(s.charAt(i-1));
    }
}
