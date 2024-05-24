package 정렬;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] nums = {7,5,9,0,3,1,6,2,4,8};
        int min_idx;
        int temp;
        for(int i = 0; i < nums.length; i++){
            min_idx =i; // 가장 작은 원소가 가장 앞에 있다고 가정
            for(int j = i+1; j < nums.length; j++){
                if(nums[min_idx] > nums[j]){    // 뒤에 원소중에 가장 작은 원소가 있다면 변경
                    min_idx = j;
                }
            }
            // swap
            temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;
        }

        System.out.println(Arrays.toString(nums));

    }
}
