package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            arrayList.add(scanner.nextInt());
        }
        Collections.reverse(arrayList);

        for(int money : arrayList){
            if(money <= k){
                answer += (k / money);
                k = (k % money);
            }
        }
        System.out.println(answer);
    }
}
