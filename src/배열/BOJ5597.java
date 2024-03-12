package 배열;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arrs = new int[30];
        int n;
        for(int i =0; i<28;i++){
            n = scanner.nextInt();
            arrs[n-1] = 1;
        }
        for(int i =0; i<30;i++){
            if (arrs[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
