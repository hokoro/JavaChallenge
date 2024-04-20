package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rb.readLine());    // 명령어를 받는 개수
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int lastInt = -1; // 가장 최근에 push된 데이터 즉 큐의 마지막 원소
        String commend;
        Queue<Integer> queueInt = new LinkedList<Integer>();
        for(int i =0; i<n; i++){
            st = new StringTokenizer(rb.readLine());
            commend = st.nextToken();

            if(commend.equals("push")){
                lastInt = Integer.parseInt(st.nextToken()); // queue에 들어갈 숫자
                queueInt.add(lastInt);
            } else if (commend.equals("pop")) {
                if(queueInt.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(queueInt.poll()).append("\n");
            } else if (commend.equals("size")) {
                sb.append(queueInt.size()).append("\n");
            }else if (commend.equals("empty")){
                if(queueInt.isEmpty()){
                    sb.append(1).append("\n");
                    continue;
                }else{
                    sb.append(0).append("\n");
                    continue;
                }
            } else if(commend.equals("front")){
                if(queueInt.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(queueInt.peek()).append("\n");
            } else if (commend.equals("back")) {
                if(queueInt.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(lastInt).append("\n");
            }

        }
        System.out.println(sb);
    }
}
