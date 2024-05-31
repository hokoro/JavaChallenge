package 브루트포스;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination {

    private static int count  = 0;
    public static void combination(int arr[] , boolean visited[] ,int start, int depth , int r){

        if(depth == r){
            ArrayList<Integer> trues = new ArrayList<Integer>();
            ArrayList<Integer> falses = new ArrayList<Integer>();
            count++;
            for(int i = 0; i < visited.length; i++){
                if(visited[i]){
                    trues.add(i);
                }else{
                    falses.add(i);
                }
            }
            System.out.println(trues);
            System.out.println(falses);
            System.out.println("-------------------------------------------");
        }

        for(int i = start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr , visited , i+1, depth + 1 , r);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        boolean []visited = new boolean[arr.length];

        combination(arr , visited , 0,0,4);
        System.out.println(Arrays.toString(visited));
        System.out.println(count);
    }
}
