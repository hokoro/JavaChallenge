package 심화1;

import java.util.Scanner;

public class BOJ2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);

            if(word == 'c'){
                if(i+1 < s.length()){
                    if(s.charAt(i+1) == '='){
                        i++;
                    }else if (s.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }else if(word == 'd'){
                if(i+1 < s.length()){
                    if(s.charAt(i+1) == 'z'){
                        if(i+2 < s.length()){
                            if(s.charAt(i+2) == '='){
                                i+=2;
                            }
                        }
                    }else if(s.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }else if(word == 'l'){
                if(i+1 < s.length()){
                    if(s.charAt(i+1) == 'j'){
                        i++;
                    }
                }
            }else if(word == 'n'){
                if(i+1 < s.length()){
                    if(s.charAt(i+1) == 'j'){
                        i++;
                    }
                }
            }else if(word == 's'){
                if(i+1 < s.length()){
                    if(s.charAt(i+1) == '='){
                        i++;
                    }
                }
            }else if(word == 'z'){
                if(i+1 < s.length()){
                    if(s.charAt(i+1) == '='){
                        i++;
                    }
                }
            }
            answer++;
        }


        System.out.println(answer);
    }
}
