package 해시;

import java.util.HashMap;

public class Programmers_hash2 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String , Integer> hashMap = new HashMap<String , Integer>();
        for(String part : participant){
            if(!hashMap.containsKey(part)){
                hashMap.put(part , 1);
            }else{
                hashMap.put(part , hashMap.get(part) + 1);
            }
        }
        for(String comp : completion){
            if(hashMap.containsKey(comp)){
                hashMap.put(comp , hashMap.get(comp) - 1);
            }
        }

        for(String part : participant){
            if(hashMap.get(part) == 1){
                answer = part;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"} , new String[]{"stanko", "ana", "mislav"}));
    }
}
