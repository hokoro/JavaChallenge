package 해시;
import java.io.*;
import java.util.*;
public class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        HashMap<String , Integer>hashMap = new HashMap<String , Integer>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        String key;
        for(int i = 0; i < n; i++){
            key = st1.nextToken();
            hashMap.put(key , hashMap.getOrDefault(key , 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<m;i++){
            key = st2.nextToken();
            if(hashMap.containsKey(key)){
                sb.append(hashMap.get(key)).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
