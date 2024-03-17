package 문자열;

import java.util.Scanner;

public class BOJ2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for(int i = 0;i<count;i++){
            int num = scanner.nextInt();
            String s = scanner.next();
            StringBuilder sb = new StringBuilder();
            String[]sp = s.split("");
            for(String a :sp){
                for(int j = 0; j<num;j++){
                    sb.append(a);
                }
            }
            System.out.println(sb);
        }
    }
}
