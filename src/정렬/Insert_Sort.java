package 정렬;

import java.util.Arrays;

public class Insert_Sort {
    public static void main(String[] args) {
        int [] nums = {7,5,9,0,3,1,6,2,4,8};

        for(int i = 1; i < nums.length; i++){
            for(int j = i; j > 0; j--){
                if(nums[j] < nums[j-1]){    // 한칸 씩 앞으로 이동하면서 자기 원소의 위치를 찾는다.
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
