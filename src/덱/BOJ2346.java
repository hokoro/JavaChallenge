package 덱;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Deque<Integer> dequeIdx = new ArrayDeque<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int value = 0;
        while(st.hasMoreTokens()){
            deque.addLast(Integer.parseInt(st.nextToken()));
            dequeIdx.addLast(i);
            i++;
        }
        while (true){
            value = deque.removeFirst();
            if(!deque.isEmpty()){
                sb.append(dequeIdx.removeFirst()).append(" ");
            }else{
                sb.append(dequeIdx.removeFirst());
            }

            if(deque.isEmpty()){
                break;
            }
            if(value > 0){
                value--;
                for(int j = 0; j < value; j++){
                    deque.addLast(deque.removeFirst());
                    dequeIdx.addLast(dequeIdx.removeFirst());
                }
            }else{
                for(int j = 0; j > value; j--){
                    deque.addFirst(deque.removeLast());
                    dequeIdx.addFirst(dequeIdx.removeLast());
                }
            }
        }
        System.out.println(sb);
    }
}
