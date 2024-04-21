package 스택;

import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String>stack;
        String []tokens;
        String top;
        StringBuilder sb = new StringBuilder();
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            stack = new Stack<String>();
            tokens = scanner.next().split("");
            for(int j = 0; j < tokens.length; j++){
                if(stack.isEmpty()){    // 스택이 비어 있을때
                    if(tokens[j].equals(")")){  // 바로 실패일 경우
                        stack.add(tokens[j]);
                        break;
                    }else{  // 정상적으로 "(" 이 토큰이 들어온 경우
                        stack.add(tokens[j]);
                        continue;
                    }
                }else{
                    top = stack.peek(); //스택의 최상위 데이터
                    if(top.equals("(") && tokens[j].equals(")")){   // 괄호 토큰이 완성된 경우
                        stack.pop();
                        continue;
                    }else{      // 완성되지 않은 경우
                        stack.add(tokens[j]);
                        continue;
                    }

                }
            }
            if(!stack.isEmpty()){   // 만약에 스택이 남아 있다면
                sb.append("NO").append("\n");
            }else{
                sb.append("YES").append("\n");
            }
        }
        System.out.println(sb);
    }
}
