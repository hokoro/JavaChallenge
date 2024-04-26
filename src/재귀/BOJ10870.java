package 재귀;

import java.util.Scanner;

public class BOJ10870 {
    static int n;
    static void input(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
    }

    static int fibonach(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonach(n-1) + fibonach(n-2);
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(fibonach(n));
    }
}
