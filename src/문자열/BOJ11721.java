package 문자열;

import java.io.*;
import java.util.*;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringBuilder token = new StringBuilder();

        String[]word = br.readLine().split("");

        for(int i = 0; i < word.length; i++){
            if((i+1) % 10 == 0){
                token.append(word[i]);
                sb.append(token).append("\n");
                token = new StringBuilder();
            }else{
                token.append(word[i]);
            }
        }
        sb.append(token).append("\n");
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
