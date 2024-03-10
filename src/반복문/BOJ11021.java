package 반복문;

import java.util.Scanner;

public class BOJ11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a,b;
        for (int i=0; i<n;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println("Case #"+(i+1)+": " + (a+b));
        }
    }
}
