package 정렬;

import java.io.*;
import java.util.*;
public class BOJ2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < 9; i++){
            int num = Integer.parseInt(br.readLine());
            sum += (num);
            arrayList.add(num);
        }
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9;j++){
                if(sum - (arrayList.get(i) + arrayList.get(j)) == 100){
                    num1 = i;
                    num2 = j;
                    break;
                }
            }
        }

        arrayList.remove(num1);
        arrayList.remove(num2-1);
        Collections.sort(arrayList);

        for(int i =0; i < 7; i++){
            sb.append(arrayList.get(i)).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}
