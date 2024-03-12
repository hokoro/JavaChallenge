package 배열;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int answer = 0;
        int[]arrys = new int[n];

        for(int i = 0;i<arrys.length;i++){
            arrys[i] = scanner.nextInt();
        }

        int find = scanner.nextInt();

        for(int i = 0;i<arrys.length;i++){
            if (arrys[i] == find){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
