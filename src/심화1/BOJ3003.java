package 심화1;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrs = {1,1,2,2,2,8};

        for(int i = 0; i < arrs.length; i++){
            int num = scanner.nextInt();
            System.out.print((arrs[i] - num) + " ");
        }
    }
}
