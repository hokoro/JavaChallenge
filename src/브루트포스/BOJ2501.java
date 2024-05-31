package 브루트포스;

import java.io.*;
import java.util.*;
public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;
        int count = 0;
        int i = 1;
        while(true){
            
            if(n%i == 0){
                count++;
            }
            if(count == k){
                answer = i;
                break;
            } else if (count < k && i > n) {
                break;
            }
            i++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
