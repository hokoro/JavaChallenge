package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]words = br.readLine().split("");

        Arrays.sort(words , Comparator.reverseOrder());
        StringBuilder answer = new StringBuilder();

        for(String word : words){
            answer.append(word);
        }
        System.out.println(answer);
    }
}
