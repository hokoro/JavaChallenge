package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());    //  테스트 케이스의 수
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        String commend;
        int num;
        for(int i =0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            commend = st.nextToken();
            if(commend.equals("push")){
                num = Integer.parseInt(st.nextToken());
                stack.add(num);
            } else if (commend.equals("pop")) {
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.pop()).append("\n");
            } else if(commend.equals("size")){
                sb.append(stack.size()).append("\n");
            } else if (commend.equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                    continue;
                }else{
                    sb.append(0).append("\n");
                    continue;
                }
            } else if (commend.equals("top")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
