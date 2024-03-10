package 반복문;

import java.io.*;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
            int n = Integer.parseInt(reader.readLine());
            String line;
            int a,b;
            for(int i = 0; i < n; i++){
                line = reader.readLine();
                String[]parts = line.split("\\s+");
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[1]);
                writer.write(String.valueOf(a+b));
                writer.newLine();
            }
            writer.flush();

        }catch (IOException | NumberFormatException e){
            e.printStackTrace();
        }
    }
}
