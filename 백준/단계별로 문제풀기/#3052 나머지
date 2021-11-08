import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] Remain = new int[10];
        for(int i = 0; i < 10; i++){
            Remain[i] = Integer.parseInt(bf.readLine()) % 42;
        }
        int count = 10;
        for(int j = 0; j < 10; j++){
            for(int k = j + 1; k < 10; k++){
                if(Remain[j] == Remain[k]){
                    count--;
                    break;
                }
            }
        }
        String result = String.valueOf(count);
        bw.write(result);
        bw.flush();
        bw.close();
        bf.close();
    }
}