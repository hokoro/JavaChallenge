package 배열;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x;

        n = scanner.nextInt();
        x = scanner.nextInt();
        int []arrays = new int[n];
        for(int i=0; i<arrays.length;i++){
            arrays[i] = scanner.nextInt();
            if (arrays[i] < x){
                System.out.print(arrays[i] + " ");
            }
        }

    }
}
