package 배열;

import java.util.Scanner;

public class BOJ10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int []arrs = new int[n];
        int a,b,c;
        for(int i = 0; i<m;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            for(int j = a-1;j <b; j++){
                arrs[j] = c;
            }
        }
        for(int k = 0; k<arrs.length;k++){
            System.out.print(arrs[k] + " ");
        }
    }
}
