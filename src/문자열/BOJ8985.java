package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int sum;
        int correct;
        for(int i = 0; i < n; i++){
            sum = 0;
            correct = 0;
            String[] tokens = br.readLine().split("");
            for(int j = 0; j<tokens.length; j++){
                if(tokens[j].equals("O")){
                    correct++;
                    sum+=correct;
                }else{
                    correct = 0;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
