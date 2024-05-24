package 정렬;

import java.io.*;
import java.util.*;

public class BOJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Integer n = Integer.parseInt(br.readLine());

        Integer[][] nums = new Integer[n][2];

        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            nums[i][0] = Integer.parseInt(st.nextToken());
            nums[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(nums , Comparator.comparingInt((Integer[] arr) -> arr[0]).thenComparing(arr -> arr[1]));

        for(int i = 0; i < n; i++){
            sb.append(nums[i][0]).append(" ").append(nums[i][1]).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
