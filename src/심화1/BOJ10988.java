package 심화1;

import java.util.Objects;
import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[]sp = s.split("");

        int len_ = (sp.length) / 2;
        boolean check = true;
        if(sp.length % 2 == 0){
            for(int i = 0; i < len_; i++){
                if(!Objects.equals(sp[i], sp[sp.length - i - 1])){
                    check = false;
                    break;
                }
            }
        }
        else{
            for(int i = 0; i <= len_; i++){
                if(!Objects.equals(sp[i] , sp[sp.length-i-1])){
                    check = false;
                    break;
                }
            }
        }

        if (!check){
            System.out.println(0);
        }else {
            System.out.println(1);
        }

    }
}
