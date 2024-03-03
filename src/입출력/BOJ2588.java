package 입출력;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int answer = a * b;
        int [] arr = new int[3];

        for(int i = 0; i<3;i++){
            arr[i] = b % 10;
            System.out.println(a * arr[i]);
            b /= 10;
        }
        System.out.println(answer);
    }
}
