package 해시;

import java.util.HashMap;

public class Programmers_hash3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String substr;
        HashMap<String , Integer> hashMap = new HashMap<String , Integer>();
        for(String phone : phone_book){
            hashMap.put(phone , 1);
        }

        for(String phone : phone_book){
            for(int i = 1; i < phone.length(); i++){
                substr = phone.substring(0,i);
                if(hashMap.containsKey(substr)){
                    System.out.println("접두어 존재 : " + substr);
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
