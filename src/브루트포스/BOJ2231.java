package 브루트포스;

import java.io.*;
import java.util.*;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 1 ; i <= n; i++){
            int len = String.valueOf(i).length();
            int num = i;
            int sum = i;
            for(int j = 0; j < len; j++){
                sum += (num / (int)Math.pow(10 , len-j));
                num = num % (int)Math.pow(10 , len-j);
            }
            if(sum == n){
                answer = i;
                break;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
