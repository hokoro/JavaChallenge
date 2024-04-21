package 스택;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int k = scanner.nextInt();
        int num;
        int removeNum;
        Stack<Integer>stack = new Stack<Integer>();
        for(int i = 0; i < k; i++){
            num = scanner.nextInt();
            if(num != 0){
                stack.add(num);
                answer += (num);
            }else{
                removeNum = stack.pop();
                answer -= (removeNum);
            }
        }
        System.out.println(answer);

    }
}
