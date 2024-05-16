package 그리디;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer n1 = new StringTokenizer(br.readLine());
        StringTokenizer n2 = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for(int i = 0; i<n;i++){
            arrayList.add(Integer.parseInt(n1.nextToken()));
        }
        for(int i = 0; i<n;i++){
            arrayList2.add(Integer.parseInt(n2.nextToken()));
        }


        Collections.sort(arrayList);
        Collections.sort(arrayList2 , Comparator.reverseOrder());

        int sum = 0;
        for(int i = 0; i < n;i++){
            sum += (arrayList.get(i) * arrayList2.get(i));
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
