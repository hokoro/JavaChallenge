package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int sum = 0;
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while(st.hasMoreTokens()){
            Integer num = Integer.parseInt(st.nextToken());
            arrayList.add(num);
        }

        arrayList.sort(Comparator.comparingInt((Integer arr) ->arr));
        for(Integer a : arrayList){
            sum += (a);
            answer += (sum);
        }
        System.out.println(answer);
    }
}
