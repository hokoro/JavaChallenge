package 해시;

import java.io.*;
import java.util.*;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hashSet = new HashSet<Integer>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            hashSet.add(Integer.parseInt(st1.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < m ; i++){
            int key = Integer.parseInt(st2.nextToken());

            if(hashSet.contains(key)){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
