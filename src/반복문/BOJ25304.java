package 반복문;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int count = scanner.nextInt();
        int p,c;
        int sum = 0;
        for (int i = 0; i<count; i++){
            p = scanner.nextInt();
            c = scanner.nextInt();
            sum += (p *c);
        }

        if (price == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
