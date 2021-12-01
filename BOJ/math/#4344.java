import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        String[][] stringArray = new String[i][1001];
        for(int j = 0; j < i; j++){
            String s = br.readLine();
            stringArray[j] = s.split(" ");
        }
        String result;
        for(int j = 0; j < stringArray.length; j++) {
            int sum = 0, count = 0; float avg, studentAvg = 0;
            for (int k = 1; k < Integer.parseInt(stringArray[j][0]) + 1 ; k++){
                sum += Integer.parseInt(stringArray[j][k]);
            }
            avg = (float) sum / Integer.parseInt(stringArray[j][0]);

            for (int k = 1; k < Integer.parseInt(stringArray[j][0]) + 1 ; k++){
                if(avg < Integer.parseInt(stringArray[j][k])){
                    count++;
                }
                studentAvg = (float) count / Integer.parseInt(stringArray[j][0]);
            }

            if(j != stringArray.length - 1) {
                result = String.format("%.3f", studentAvg * 100) + "%" + "\n";
            }
            else{
                result = String.format("%.3f", studentAvg * 100) + "%";
            }
            bw.write(result);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}