import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] Num = new int[9];
        for(int i = 0; i < 9; i++){
            Num[i] = Integer.parseInt(bf.readLine());
        }

        int max = 0;
        int index = 0;

        int count = 0;
        for(int value:Num){
            count++;
            if(value>max){
                max = value;
                index = count;
            }
        }

        String result = (String.valueOf(max) + "\n" + String.valueOf(index));
        bw.write(result);
        bw.flush();
        bw.close();
        bf.close();
    }
}