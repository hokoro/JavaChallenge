package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrs = new int[26];

        Arrays.fill(arrs, -1);

        String s = scanner.nextLine();

        String []sp = s.split("");

        // 97
        for(int i = 0; i<sp.length;i++){
            int idx = ((int)s.charAt(i)) % 97;
            if (arrs[idx] == -1){
                arrs[idx] = i;
            }
        }
        for(int i = 0; i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }

    }
}
