package 배열;

import java.util.Scanner;

public class BOJ10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int []arrs = new int[n];

        for(int i = 0; i<n;i++){
            arrs[i] = i+1;
        }
        int a,b,temp;
        int len_;
        for(int i = 0; i < m; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            a--;
            b--;
            len_ = (a+b+1) / 2;
            for(int j = a; j <len_;j++){
                temp = arrs[j];
                arrs[j] = arrs[b];
                arrs[b] = temp;
                b--;
            }
        }
        for (int k=0; k<arrs.length;k++){
            System.out.print(arrs[k] + " ");
        }
    }
}
