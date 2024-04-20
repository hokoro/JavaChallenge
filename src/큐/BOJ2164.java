package 큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queueInt = new LinkedList<Integer>();

        for(int i = 1; i<=n; i++){
            queueInt.add(i);
        }

        while (queueInt.size()!=1){
            queueInt.poll();
            queueInt.add(queueInt.poll());
        }
        System.out.println(queueInt.poll());
    }
}
