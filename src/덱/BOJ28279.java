package 덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<Integer>();
        StringTokenizer st;
        int commend;
        int n = Integer.parseInt(br.readLine());    // 총 명령어 개수
        int value;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            commend = Integer.parseInt(st.nextToken());

            if(commend == 1){
                value = Integer.parseInt(st.nextToken());
                deque.addFirst(value);
            } else if (commend == 2) {
                value = Integer.parseInt(st.nextToken());
                deque.add(value);
            } else if (commend == 3){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.removeFirst()).append("\n");
            } else if(commend == 4){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.removeLast()).append("\n");
            } else if(commend == 5){
                sb.append(deque.size()).append("\n");
            } else if (commend == 6){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                    continue;
                }else{
                    sb.append(0).append("\n");
                    continue;
                }
            } else if (commend == 7){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getFirst()).append("\n");
            }else if (commend == 8){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
