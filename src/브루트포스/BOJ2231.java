package 브루트포스;

import java.util.*;
import java.io.*;
public class BOJ2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str_N = br.readLine();

        int len = str_N.length();

        int n = Integer.parseInt(str_N);
        int result = 0;

        for(int i  = (n - (n * 9)); i<n; i++){
            int number = i;
            int sum = 0;

            while(number != 0){
                sum += (number % 10);
                number /= 10;
            }
            ;
            if(sum + i == n){
                result = i;
                break;
            }

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
