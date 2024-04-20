package 큐;

import com.sun.jdi.connect.spi.TransportService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1158 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queueInt = new LinkedList<Integer>();

        for(int i = 1; i <=n; i++){
            queueInt.add(i);
        }
        sb.append("<");
        int count = 0;
        int number;
        while(!queueInt.isEmpty()){
            if(k - 1 == count){
                count = 0;
                number = queueInt.poll();
                if(!queueInt.isEmpty()){
                    sb.append(number).append(", ");
                }else {
                    sb.append(number);
                }
                continue;
            }
            count += 1;
            queueInt.add(queueInt.poll());
        }
        sb.append(">");
        System.out.println(sb);
    }
}
