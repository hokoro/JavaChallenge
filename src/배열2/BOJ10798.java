package 배열2;

import java.util.Scanner;

public class BOJ10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []strs = new String[5];
        int sum = 0;

        for(int i = 0;i<5;i++){
            strs[i] = scanner.next();
            sum += (strs[i].length());
        }

        int i = 0;  // 열의 개수
        StringBuilder sb = new StringBuilder();
        while(sb.length() != sum){
            for(int j = 0; j<5; j++){
                if(i<strs[j].length()){
                    sb.append(strs[j].charAt(i));
                }
            }
            i++;
        }

        System.out.println(sb);
    }
}
