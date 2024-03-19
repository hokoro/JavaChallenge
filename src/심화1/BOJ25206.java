package 심화1;

import java.util.Scanner;

public class BOJ25206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double credit_sum = 0;
        double score_sum = 0;
        for(int i = 0; i < 20; i++){
            String info = scanner.nextLine();
            String[]sp = info.split(" ");

            double score;
            double credit = Double.parseDouble(sp[1]);
            if (sp[2].equals("A+")){

                score = 4.5;
            } else if (sp[2].equals("A0")) {

                score = 4.0;
            } else if (sp[2].equals("B+")) {

                score = 3.5;
            } else if (sp[2].equals("B0")) {

                score = 3.0;
            } else if(sp[2].equals("C+")){

                score = 2.5;
            } else if(sp[2].equals("C0")){

                score = 2.0;
            } else if(sp[2].equals("D+")){

                score = 1.5;
            } else if(sp[2].equals("D0")){

                score = 1.0;
            } else if (sp[2].equals("P")) {
                continue;
            }else{

                score = 0.0;
            }
            credit_sum += credit;
            score_sum += (score * credit);
        }
        System.out.println(score_sum / credit_sum);
    }
}
