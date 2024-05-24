package 브루트포스;

import java.io.*;
import java.util.*;

public class BOJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            arrayList.add(Integer.parseInt(st2.nextToken()));
        }
        int max = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1;k < n; k++){
                    if(max < arrayList.get(i) + arrayList.get(j) + arrayList.get(k) && arrayList.get(i) + arrayList.get(j) + arrayList.get(k) <= sum){
                        max = arrayList.get(i) + arrayList.get(j) + arrayList.get(k);
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
