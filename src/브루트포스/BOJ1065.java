package 브루트포스;

import java.io.*;
import java.util.*;
public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        if(n < 100){
            answer = n;
        }else{
            answer = 99;
            int len;
            for(int i = 100; i <= n; i++){
                if(i < 1000){
                    len = 3;
                    int num = i;
                    int []nums = new int[len];
                    for(int j = 0; j < len ; j++){
                        nums[j] = num / (int)Math.pow(10 , 2-j);
                        num = num % (int)Math.pow(10 , 2-j);
                    }

                    if(nums[1] - nums[0] == nums[2] - nums[1]){
                        answer++;
                    }
                }else{
                    len = 4;
                    int num = i;
                    int []nums = new int[len];
                    for(int j = 0; j < len ; j++){
                        nums[j] = num / (int)Math.pow(10 , 3-j);
                        num = num % (int)Math.pow(10 , 3-j);
                    }
                    if(nums[1] - nums[0] == nums[2] - nums[1] && nums[2] - nums[1] == nums[3] - nums[2]){
                        answer++;
                    }
                }


            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
