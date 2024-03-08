package 조건식;

import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int []dices = new int[3];
        int answer = 0;
        for(int i = 0; i<dices.length;i++){
            dices[i] = scanner.nextInt();
            if (max < dices[i]){
                max = dices[i];
            }
        }

        if (dices[0] == dices[1] && dices[1] == dices[2]) {
            answer = 10000 + dices[0] * 1000;
        } else if (dices[0] == dices[1]) {
            answer = 1000 + dices[0] * 100;
        } else if (dices[1] == dices[2]) {
            answer = 1000 + dices[1] * 100;
        } else if (dices[2] == dices[0]) {
            answer = 1000  + dices[2] * 100;
        } else if(dices[0] != dices[1] && dices[1] != dices[2] && dices[2] != dices[0]){
            answer = 100 * max;
        }

        System.out.println(answer);
    }
}
