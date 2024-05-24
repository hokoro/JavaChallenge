package 정렬;

public class Counting_Sort {

    public static int max(int [] arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] nums = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};

        int max = max(nums);

        int [] arr = new int[max+1];

        for(int num : nums){
            arr[num]++;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                System.out.print(i + " ");
            }
        }


    }
}
