package 심화1;

import java.util.Scanner;

public class BOJ1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int answer = 0;
        for(int i = 0; i <count; i++){
            String s = scanner.next();
            boolean check = true;
            for(int j = 0; j<s.length();j++){
                char w = s.charAt(j);
                for(int k = 0; k<j; k++){
                    if (w !=s.charAt(j-1) && s.charAt(k) == w){
                        check = false;
                        break;
                    }
                }
            }
            if (check){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
