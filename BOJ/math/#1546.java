import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] stringArray = s.split(" ");

        int[] num = new int[i];
        for(int j = 0; j < i; j++){
            num[j] = Integer.parseInt(stringArray[j]);
        }
        int max = 0;
        for(int k = 0; k < i; k++){
            if(num[k] > max){
                max = num[k];
            }
        }
        float sum = 0;
        float[] numf = new float[i];
        for(int l = 0; l < i; l++) {
            numf[l] = (float) num[l] / max * 100;
            sum += numf[l];
        }
        float avg = sum / (float) i;
        String result = String.valueOf(avg);
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}