package 조건식;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m - 45 < 0){
            if (h == 0){
                h = 23;
                m += 60;
            }else {
                h--;
                m += 60;
            }
            m -= 45;
        } else{
            m -= 45;
        }

        System.out.println(h + " " + m);
    }
}
