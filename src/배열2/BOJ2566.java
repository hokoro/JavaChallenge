package 배열2;

import java.util.Scanner;

public class BOJ2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][]arrs = new int[9][9];
        int max = 0;
        int x = 0,y=0;

        for(int i=0;i<9;i++){
            for(int j=0; j<9;j++){
                arrs[i][j] = scanner.nextInt();
                if(max <arrs[i][j]){
                    max = arrs[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((x+1)+" "+(y+1));
    }
}
