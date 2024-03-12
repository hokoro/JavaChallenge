package 배열;

import java.util.Scanner;

public class BOJ10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []arrs = new int[n];

        for(int i = 0; i<n;i++){
            arrs[i] = i+1;
        }
        int temp = 0;

        int a,b;
        for(int j = 0; j<m;j++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            a -=1;
            b -=1;

            temp = arrs[a];
            arrs[a] = arrs[b];
            arrs[b] = temp;
        }

        for(int k = 0; k <arrs.length;k++){
            System.out.print(arrs[k] + " ");
        }
    }
}
