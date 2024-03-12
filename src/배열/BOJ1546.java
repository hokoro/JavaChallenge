package 배열;

import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double []arrs = new double[n];
        int max = 0;
        for(int i = 0; i<n; i++){
            arrs[i] = scanner.nextInt();
            if (max <arrs[i]){
                max = (int)arrs[i];
            }
        }
        double sum = 0;
        for(int i =0; i<n;i++){
            arrs[i] = arrs[i]/max *100;
            sum += arrs[i];
        }
        System.out.println(sum / n);
    }
}
