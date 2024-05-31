package 브루트포스;

import java.io.*;
import java.util.*;
public class BOJ7586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int [][]arrs = new int[n][2];
        int []answers = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arrs[i][0] = Integer.parseInt(st.nextToken());
            arrs[i][1] = Integer.parseInt(st.nextToken());
            answers[i] = 1;
        }

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arrs[i][0] > arrs[j][0] && arrs[i][1] > arrs[j][1]){
                    answers[j]++;
                } else if (arrs[i][0] < arrs[j][0] && arrs[i][1] < arrs[j][1]) {
                    answers[i]++;
                }
            }
        }

        for(int i =0; i < n; i++){
            sb.append(answers[i]).append(" ");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}
