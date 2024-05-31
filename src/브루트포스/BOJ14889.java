package 브루트포스;

import java.io.*;
import java.util.*;
public class BOJ14889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int [][]arrs = new int[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arrs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                arrs[i][j] += (arrs[j][i]);
            }
        }
    }
}
