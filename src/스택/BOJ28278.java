package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int commands = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int command;
        for(int i =0; i<commands; i++){
            st = new StringTokenizer(br.readLine());
            command = Integer.parseInt(st.nextToken());
            
            if(command == 1){
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);
            } else if (command ==2) {
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.pop()).append("\n");
            } else if (command == 3) {
                sb.append(stack.size()).append("\n");
            } else if (command == 4) {
                if (stack.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }else if (command == 5){
                if (stack.isEmpty()){
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.peek()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
