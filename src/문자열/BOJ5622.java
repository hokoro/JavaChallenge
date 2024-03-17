package 문자열;

import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();
        int answer = 0;
        for(int i =0; i<s.length();i++){
            char a = s.charAt(i);

            if(65 <= (int)a && (int)a <=67){
                answer += 3;
            } else if (68 <= (int)a && (int)a <=70) {
                answer += 4;
            } else if (71 <= (int)a && (int)a <=73) {
                answer += 5;
            } else if (74 <= (int)a && (int)a <=76) {
                answer += 6;
            } else if (77 <= (int)a && (int)a <=79) {
                answer += 7;
            } else if (80 <= (int)a && (int)a <=83) {
                answer += 8;
            } else if (84 <= (int)a && (int)a <=86) {
                answer += 9;
            } else if (87 <= (int)a && (int)a <=90) {
                answer += 10;
            }
        }

        System.out.println(answer);
    }
}
