package 배열;

import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arrs = new int[42];
        int n;
        int answer = 0;
        for(int i =0; i<10;i++){
            n = scanner.nextInt();
            n = n % 42;
            arrs[n]++;
        }
        for(int i=0; i<arrs.length;i++){
            if (arrs[i] >= 1){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
