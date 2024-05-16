package 그리디;

import java.io.*;


public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int []nums = new int[n+1];
        int []bases = {1,-1,1,2,-1,2,3,2,3,4};

        if(n < 13){
            bw.write(String.valueOf(bases[n-3]));
        }else{
            for(int i = 0; i < 10; i++){
                nums[i+3] = bases[i];
            }
            for(int i = 13; i<=n; i++){
                nums[i] = nums[i-5] + 1;
            }
            bw.write(String.valueOf(nums[n]));
        }
        bw.flush();
        bw.close();
    }
}
