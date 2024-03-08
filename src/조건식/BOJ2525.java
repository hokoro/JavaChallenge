package 조건식;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        int m_ = scanner.nextInt();

        int convertHour = (m + m_) / 60;
        int convertMin = (m + m_) % 60;

        if (h + convertHour > 23){
            h = (h + convertHour) % 24;
        } else {
            h = h + convertHour;
        }
        m = convertMin;
        System.out.println(h + " " + m);
    }
}
