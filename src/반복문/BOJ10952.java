package 반복문;

import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;

        while (true){
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(a == 0 && b == 0){
                break;
            }

            System.out.println(a+b);
        }
    }
}
