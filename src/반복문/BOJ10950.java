package 반복문;

import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a,b;
        for(int i = 0; i<n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println(a+b);
        }
    }
}
