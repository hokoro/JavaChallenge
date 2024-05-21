import java.util.HashMap;

class Solution {
    public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String , Integer> hashMap = new HashMap<String , Integer>();
        for(String []clothe : clothes){
            System.out.println(clothe[1]);
            if(!hashMap.containsKey(clothe[1])){
                hashMap.put(clothe[1] , 1);
            }else{
                hashMap.put(clothe[1] , hashMap.get(clothe[1])+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //String [][]clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        String [][]clothes =
                {
                        {"yellow_hat", "headgear"},
                        {"blue_sunglasses", "eyewear"},
                        {"green_turban", "headgear"},
                        {"blue_jeans","pants"},
                        {"red_hood","top"}
                };
        System.out.println(solution(clothes));

    }
}