package 배열2;

import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int [][]arrs = new int[n][m];
        int [][]arrs2 = new int[n][m];


        for(int i = 0; i <n; i++){
            for(int j=0; j < m; j++){
                arrs[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i <n; i++){
            for(int j=0; j < m; j++){
                arrs2[i][j] = scanner.nextInt();
                arrs[i][j] = arrs[i][j] + arrs2[i][j];
            }
        }

        for(int i = 0; i <n; i++){
            for(int j=0; j < m; j++){
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println("");
        }


    }
}
