package 그리디;

import java.io.*;

public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[]moneys = {25,10,5,1};
        int money;
        for(int i = 0; i < n; i++){
            money = Integer.parseInt(br.readLine());
            for(int m : moneys){
                sb.append(money/m).append(" ");
                money = money % m;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
