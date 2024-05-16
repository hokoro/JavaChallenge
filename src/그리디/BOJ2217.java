package 그리디;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arrayList , Comparator.reverseOrder());
        int max = arrayList.get(0);

        for(int i = 2;  i<=n; i++){
            if(arrayList.get(i-1) * i > max){
                max = arrayList.get(i-1) * i;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}
