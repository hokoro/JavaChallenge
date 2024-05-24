package 정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Array_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int []nums1 = new int[n];
        int []nums2 = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            nums1[i] = Integer.parseInt(st2.nextToken());
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            nums2[i] = Integer.parseInt(st3.nextToken());
        }


        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        while(k != 0){
            if(nums1[i] < nums2[n-i-1]){
                int temp = nums1[i];
                nums1[i] = nums2[n-i-1];
                nums2[n-i-1] = temp;
            }
            i++;
            k--;
        }

        for(int num : nums1){
            sum += (num);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
