package 정렬;

import java.util.*;
import java.io.*;
public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int []nums = new int[10000+1];
        int num;

        for(int i = 0; i < n; i++){
            num = Integer.parseInt(br.readLine());
            nums[num]++;
        }


        int count = 0;
        int i = 0;

        while(count != n){
            if(nums[i] > 0){
                for(int j = 0; j < nums[i]; j++){
                    sb.append(i).append("\n");
                    count++;
                }
            }
            i++;
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
