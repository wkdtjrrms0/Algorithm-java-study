import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Mul = Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine());

        int[] Digit = new int[10];

        while(Mul != 0){
            Digit[Mul % 10]++;
            Mul /= 10;
        }

        StringBuilder result= new StringBuilder();
        for(int i = 0; i < 9; i++){
            result.append(Digit[i]).append("\n");
        }
        result.append(Digit[9]);
        bw.write(result.toString());
        bw.flush();
        bw.close();
        bf.close();
    }
}