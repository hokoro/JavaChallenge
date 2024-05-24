package 브루트포스;

import java.io.*;
import java.util.*;
public class BOJ4673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        boolean [] booleans = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            if(!booleans[i]){
                sb.append(i).append("\n");
            }
            int len = String.valueOf(i).length();
            int sum = 0;
            int n = i;
            sum += (i);
            for(int j = len; j > -1; j--){
                int num = (int)Math.pow(10,j);
                sum += (n / num);
                n = n % num;
            }
            if(sum <= 10000){
                booleans[sum] = true;
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
