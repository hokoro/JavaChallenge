package 반복문;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        n = n / 4;
        StringBuilder answer = new StringBuilder(); // 문자열을 계속해서 붙이고 싶을때는 StringBuilder 클래스를 사용하는것이 좋다.
        for (int i = 0; i <n;i++){
            answer.append("long ");
        }
        answer.append("int");

        System.out.println(answer);
    }
}
