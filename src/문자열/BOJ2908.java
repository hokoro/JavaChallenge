package 문자열;

import java.util.Scanner;

public class BOJ2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder a = new StringBuilder(scanner.next());
        StringBuilder b = new StringBuilder(scanner.next());

        a.reverse();
        b.reverse();

        int a_int = Integer.parseInt(String.valueOf(a));
        int b_int = Integer.parseInt(String.valueOf(b));

        if(a_int > b_int){
            System.out.println(a_int);
        }else {
            System.out.println(b_int);
        }

    }
}
