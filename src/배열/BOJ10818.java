package 배열;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int []arrays = new int[n];

        for(int i = 0; i<arrays.length;i++){
            arrays[i] = scanner.nextInt();
        }

        int max = arrays[0];
        int min = arrays[0];

        for(int i=1;i<arrays.length;i++){
            if (max < arrays[i]){
                max = arrays[i];
            }
            if (min > arrays[i]){
                min = arrays[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
