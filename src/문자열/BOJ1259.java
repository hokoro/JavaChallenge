package 문자열;

import java.io.*;
import java.util.*;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        while (true){
            String word = br.readLine();
            if(word.equals("0")){
                break;
            }
            StringBuilder first = new StringBuilder(word);
            StringBuilder second = new StringBuilder(word);
            if(first.compareTo(second.reverse()) == 0){
                result.append("yes").append("\n");
            }else{
                result.append("no").append("\n");
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
