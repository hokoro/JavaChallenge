package 그리디;

import java.io.*;

public class BOJ1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        long sum = 0L;
        long i = 1L;
        int count = 0;
        while(true){
            if(sum > num){
                break;
            }
            sum += i;
            i++;
            count++;
        }


        bw.write(String.valueOf(count - 1));
        bw.flush();
        bw.close();
    }
}
