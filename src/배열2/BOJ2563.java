package 배열2;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]arrs = new int[100][100];

        for(int[]i:arrs)Arrays.fill(i , 0);

        int count = scanner.nextInt();
        int x,y;
        int answer = 0;

        for(int i = 0; i<count;i++){
            x = scanner.nextInt();
            y = scanner.nextInt();

            for(int j = x; j < x+10; j++){
                for(int k = y; k < y+10; k++){
                    if(arrs[j][k] == 0){
                        arrs[j][k] += 1;
                        answer++;
                    } else if (arrs[j][k] >0) {
                        continue;
                    }

                }
            }
        }

        System.out.println(answer);
    }
}
