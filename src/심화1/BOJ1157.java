package 심화1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        s = s.toUpperCase();
        int max_count = 0;
        int max = 0;
        int answer = 0;
        int []counts = new int[26];
        Arrays.fill(counts , 0);

        for(int i = 0; i < s.length(); i++){
            int idx = (int)s.charAt(i) % 65;
            counts[idx] += 1;
        }
        for(int i = 0; i < 26; i++){
            if (max < counts[i]){
                max_count = 1;
                max = counts[i];
                answer = i;
            } else if (max == counts[i]) {
                max_count++;
            }
        }

        if(max_count > 1){
            System.out.println("?");
        }else{
            System.out.println((char)(65+answer));
        }
    }
}
