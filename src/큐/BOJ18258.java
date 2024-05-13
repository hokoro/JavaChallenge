package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String commend;
        Deque<Integer> deque = new LinkedList<Integer>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            commend = st.nextToken();
            if(commend.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                deque.add(num);
            }else if (commend.equals("pop")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.remove()).append("\n");
            }else if(commend.equals("size")){
                sb.append(deque.size()).append("\n");
            }else if (commend.equals("empty")) {
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if(commend.equals("front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(deque.getFirst()).append("\n");
            }else if(commend.equals("back")){
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
