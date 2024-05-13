package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<String>();
        String strs;
        String[] strStack;
        while(true){
            strs = br.readLine();
            if(strs.equals(".")){
                break;
            }
            strStack = strs.split("");
            stack.clear();
            for(int i = 0; i<strStack.length; i++){
                if(stack.isEmpty()){
                    if(strStack[i].equals("(")){
                        stack.add(strStack[i]);
                    } else if (strStack[i].equals(")")) {
                        sb.append("no").append("\n");
                        break;
                    } else if (strStack[i].equals("[")) {
                        stack.add(strStack[i]);
                    } else if (strStack[i].equals("]")) {
                        sb.append("no").append("\n");
                        break;
                    } else if (strStack[i].equals(".")) {
                        sb.append("yes").append("\n");
                        break;
                    }
                }else{
                    String top = stack.peek();
                    if(top.equals("(") && strStack[i].equals(")")){
                        stack.pop();
                    } else if (top.equals("[") && strStack[i].equals("]")) {
                        stack.pop();
                    } else if (top.equals("(") && strStack[i].equals("]")) {
                        sb.append("no").append("\n");
                        break;
                    } else if (top.equals("[") && strStack[i].equals(")")) {
                        sb.append("no").append("\n");
                        break;
                    } else if (top.equals("(") && strStack[i].equals("[")) {
                        stack.add(strStack[i]);
                    } else if (top.equals("[") && strStack[i].equals("(")) {
                        stack.add(strStack[i]);
                    } else if (top.equals("(") && strStack[i].equals("(")) {
                        stack.add(strStack[i]);
                    } else if (top.equals("[") && strStack[i].equals("[")) {
                        stack.add(strStack[i]);
                    } else if (strStack[i].equals(".")) {
                        sb.append("no").append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
