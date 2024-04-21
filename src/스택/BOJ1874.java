package 스택;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); // 정답을 담을 StringBuilder
        int k = scanner.nextInt(); // 스택에 담을 공간
        Stack<Integer> stackInt = new Stack<Integer>();
        int target;
        boolean check;
        int n = 1;
        for(int i = 0; i < k;i++){
            target = scanner.nextInt();
            check = true;
            while (true){
                if(!stackInt.isEmpty()){    // 스택이 비어있지 않은 상태
                    if(stackInt.peek() == target){
                        stackInt.pop();
                        sb.append("-").append("\n");
                        break;
                    } else if (stackInt.peek() > target) {
                        sb = new StringBuilder("NO");
                        check =false;
                        break;
                    }else{
                        sb.append("+").append("\n");
                        stackInt.add(n);
                        n++;
                        continue;
                    }
                }else{  // 비어있는 상태
                    if(n <= target){
                        sb.append("+").append("\n");
                        stackInt.add(n);
                        n++;
                        continue;
                    }
                }
            }
            if(!check){
                break;
            }
        }
        System.out.println(sb);
    }
}
