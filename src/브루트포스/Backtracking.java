package 브루트포스;
import java.io.*;
import java.util.*;
public class Backtracking {
    private static int[] result; // 선택된 숫자를 저장할 배열

    private static StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder 객체

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = in.readLine().split(" ");

        int N = Integer.parseInt(temp[0]); // 가능한 숫자 범위
        int M = Integer.parseInt(temp[1]); // 선택할 숫자 개수

        result = new int[M]; // 결과 값을 저장할 배열 초기화

        getCombination(N, M, 0); // 조합을 구하는 백트래킹 함수 호출

        System.out.println(sb); // 결과 출력

    }

    private static void getCombination(int N, int M, int depth) {
        // 기저 조건: 선택할 숫자 개수가 M개일 때, 결과 출력
        if (depth == M) {
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 가능한 숫자 개수만큼 반복하여 후보해 생성
        for (int i = 1; i <= N; i++) {
            result[depth] = i; // 후보해에 숫자 추가
            getCombination(N, M, depth + 1); // 재귀적으로 다음 단계로 진행
        }
    }
}
