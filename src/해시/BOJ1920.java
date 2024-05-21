package 해시;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            hashSet.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            if(hashSet.contains(Integer.parseInt(stringTokenizer1.nextToken()))){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();


    }
}
