package 브루트포스;

public class Permutation {

    /*
    * int arr[] : 원본 배열
    * int output[] : 출력하고자 하는 배열
    * boolean visited[] : 방문 여부 체크
    * int depth : 현재 탐색하고 있는 인덱스
    * int r : 뽑고자 하는 개수
    * */
    public static void permutation(int arr[] , int output[] , boolean visited[] , int depth , int r){
        if(depth == r){
            for(int i = 0; i < r; i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr , output , visited , depth + 1 , r);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        int []output = new int[arr.length];
        boolean visited[] = new boolean[arr.length];

        permutation(arr , output , visited , 0 , 4);

     }
}
