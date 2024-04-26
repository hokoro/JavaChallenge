package 재귀;

import java.util.Scanner;

public class BOJ25501 {
    static StringBuilder sb = new StringBuilder();
    static int answer;
    static int count;
    static String token;
    static int n;

    static  int recursion(String s , int l , int r){
        if(l >= r){
            return 1;
        }else if(s.charAt(l) != s.charAt(r)){
            return 0;
        }else{
            count++;
            return recursion(s , l+1 , r-1);
        }
    }
    static int isPalindrome(String s){
        return recursion(s , 0 , s.length() -1);
    }
    static void input(){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i =0; i<n; i++){
            token = scanner.next();
            count = 1;
            answer = isPalindrome(token);
            sb.append(answer).append(" ").append(count);
            sb.append("\n");
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(sb);
    }
}
