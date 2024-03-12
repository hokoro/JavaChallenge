package 배열;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []arrs = new int[9];
        int answer,idx;
        answer = 0;
        idx = 0;
        for(int i = 0; i<arrs.length;i++){
            arrs[i] = scanner.nextInt();
            if (answer < arrs[i]) {
                answer = arrs[i];
                idx = i;
            }
        }

        System.out.println(answer);
        System.out.println(idx+1);

    }
}
