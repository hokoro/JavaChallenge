package 브루트포스;

import java.io.*;
import java.util.*;
public class BOJ1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int start = 665;

        while(true){
            if(count == n){
                break;
            }
            start++;
            String num = String.valueOf(start);
            int len = num.length();

            for(int i = 0; i < len-2; i++){
                String str = num.substring(i , i+3);
                if(str.equals("666")){
                    count++;
                    break;
                }
            }

        }
        bw.write(String.valueOf(start));
        bw.flush();
        bw.close();

    }
}
