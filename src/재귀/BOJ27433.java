package 재귀;

import java.util.Scanner;

public class BOJ27433 {
    static int answer = 1;
    static int n;

    static void input(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
    }
    static int rec_func(int k){
        if(k == n+1){
            return answer;
        }else{
            answer = answer * k;
            return rec_func(k+1);
        }
    }

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(answer);
    }
}
