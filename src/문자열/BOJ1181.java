package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer> hm = new HashMap<>();
        String word;
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i<n;i++){
            word = br.readLine();
            if(!hm.containsKey(word)){
                hm.put(word , 1);
                arrayList.add(word);
            }
        }
        Comparator<String> customCompartor = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = Integer.compare(o1.length() , o2.length());

                if(result == 0){
                    result = o1.compareTo(o2);
                }
                return result;
            }
        };

        Collections.sort(arrayList , customCompartor);

        for(String w : arrayList){
            System.out.println(w);
        }


    }
}
