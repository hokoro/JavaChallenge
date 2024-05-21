package 해시;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        HashMap<String , Integer> hashMap = new HashMap<String,Integer>();
        HashMap<Integer , String> hashMap1 = new HashMap<Integer,String>();
        String monster;
        for(int i = 0; i<n;i++){
            monster = br.readLine();
            hashMap.put(monster , i+1);
            hashMap1.put(i+1 , monster);
        }
        String question;

        for(int i = 0; i < m;i++){
            question = br.readLine();
            if(hashMap.containsKey(question)){
                sb.append(hashMap.get(question)).append("\n");
            }else{
                int num = Integer.parseInt(question);
                sb.append(hashMap1.get(num)).append("\n");
            }
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
