package 큐;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ1966 {
    public static void main(String[] args) {
        Deque<Integer> deque;
        Deque<Integer> dequeIdx;
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scanner.nextInt(); // test case
        int n,m;
        int num;
        int count;
        boolean check;

        for(int i = 0; i < t; i++){
            count = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            deque = new LinkedList<Integer>();
            dequeIdx = new LinkedList<Integer>();
            for(int j = 0; j < n; j++){
                num = scanner.nextInt();
                deque.add(num);
                dequeIdx.add(j);
            }
            while(true){
                int first = deque.remove(); // 덱의 첫번째 원소
                int first_idx = dequeIdx.remove(); // 덱의 첫번째 인덱스
                check = true;
                for(int item : deque){
                    if(first < item){
                        check = false;
                        deque.add(first);
                        dequeIdx.add(first_idx);
                        break;
                    }
                }
                if(check){
                    count++;
                    if(first_idx == m){
                        sb.append(count).append("\n");
                        break;
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }

        }
        System.out.println(sb);
    }
}
