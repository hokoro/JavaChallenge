package 그리디;

import java.io.*;

public class BOJ5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int money = 1000 - Integer.parseInt(br.readLine());
        int []moneys = {500,100,50,10,5,1};
        int sum = 0;
        for(int m : moneys){
            sum += (money / m);
            money = money % m;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
