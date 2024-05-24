package 정렬;

import java.util.*;
import java.io.*;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrayList);

        for(int i = 0; i < n; i++){
            sb.append(arrayList.get(i)).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();



    }
}
