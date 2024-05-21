package 해시;

import java.util.HashSet;

public class Programmers_hash1 {
    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int num: nums){
            if(!hashSet.contains(num)){
                hashSet.add(num);
            }
        }

        if(nums.length / 2 <= hashSet.size()){
            answer = nums.length / 2;
        }else{
            answer = hashSet.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));

    }
}
