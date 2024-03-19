package 심화1;

import java.util.Scanner;

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            int len1 = n-i-1;
            for(int j = 0; j < len1;j++){
                sb.append(" ");
            }
            int len2 = 2 * (i+1) - 1;
            for(int k = 0; k < len2; k++){
                sb.append("*");
            }
            System.out.println(sb);
        }
        for (int i = 0; i < n-1; i++){
            StringBuilder sb2 = new StringBuilder();
            for(int j = 0; j < i+1; j++){
                sb2.append(" ");
            }
            int len3 = 2 * (n-i-1) -1;
            for(int k = 0; k < len3; k++){
                sb2.append("*");
            }
            System.out.println(sb2);
        }
    }
}
