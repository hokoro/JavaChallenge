package 문자열;


import java.io.*;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            hashSet.add(br.readLine());
        }

        for(int j = 0; j < m; j++){
            String word = br.readLine();
            if(hashSet.contains(word)){
                result.add(word);
            }
        }

        sb.append(result.size()).append("\n");
        Collections.sort(result);
        for(String w : result){
            sb.append(w).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
