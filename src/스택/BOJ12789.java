package 스택;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BOJ12789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> finishStack = new Stack<Integer>();
        int queueInt , stackInt;
        for(int i = 0; i < n; i++){
            queue.add(scanner.nextInt());
        }
        int next = 1;
        while(true){
            if(queue.isEmpty()){                // 큐가 비어 있을떄
                if(!stack.isEmpty()){           // 스택이 비어 있지 않을떄
                    stackInt = stack.pop();
                    if(stackInt == next){
                        finishStack.add(stackInt);
                        next++;
                        continue;
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }else{  // 큐가 비어있지 않을떄
                queueInt = queue.peek();
                if(queueInt == next){   // 큐 == next
                    finishStack.add(queueInt);
                    queue.remove();
                    next++;
                    continue;
                }else{      // 큐 != next
                    if(stack.isEmpty()){        // 큐의 값이 맞지 않고 스택이 비어 있으면 큐 값을 스택에 넣는다.
                        stack.add(queueInt);
                        continue;
                    }else{                      // 큐의 값이 맞지 않는데 스택에 값이 존재 할때
                        stackInt = stack.pop(); // 스택의 값을 추출
                        if(stackInt == next){      // 스택의 값이랑 == next
                            finishStack.add(stackInt);
                            next++;
                            continue;
                        }else{
                            stack.add(stackInt);
                            stack.add(queueInt);
                            queue.remove();
                            continue;
                        }
                    }
                }
            }
        }
        if(finishStack.size() == n){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}
