package 반복문;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        while(scanner.hasNext()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
        scanner.close();
    }
}
