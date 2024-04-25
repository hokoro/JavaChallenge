package 그리디;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ1931  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            Integer [] array = {start , end};

            arrayList.add(array);
        }

        // 끝나는 시간을 기준으로 정렬 (끝나는 시간으로 -> 바로 다음으로 되는 시간으로 해야 최대 개수를 구할 수 있음)
        // 정확히는 끝나는 시간으로 오름차순으로 정렬하고 같을 경우 시작시간 순으로 정렬
        arrayList.sort(Comparator.comparingInt((Integer[] arr) -> arr[1]).thenComparingInt(arr -> arr[0]));

        int lastEnd = arrayList.get(0)[1];
        answer++;
        for(int i = 1; i < n; i++){
            Integer[] nextInfo = arrayList.get(i);
            if(lastEnd <= nextInfo[0]){
                answer++;
                lastEnd = nextInfo[1];
            }
        }
        System.out.println(answer);
    }
}
