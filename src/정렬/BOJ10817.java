package 정렬;

import java.io.*;
import java.util.*;

public class BOJ10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer [] nums = new Integer[3];

        for(int i = 0; i < 3; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        bw.write(String.valueOf(nums[1]));
        bw.flush();
        bw.close();

    }

}
