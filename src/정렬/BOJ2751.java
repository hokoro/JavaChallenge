package 정렬;

import java.util.*;
import java.io.*;
public class BOJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Integer n = Integer.parseInt(br.readLine());
        Integer[] nums = new Integer[n];

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        for(int i = 0 ; i < n; i++){
            sb.append(nums[i]).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}
