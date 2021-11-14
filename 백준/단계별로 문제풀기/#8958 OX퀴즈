import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        String[][] stringArray = new String[i][80];
        for(int j = 0; j < i; j++){
            String s = br.readLine();
            stringArray[j] = s.split("X");
        }
        String result;

        for(int j = 0; j < stringArray.length; j++) {
            int count = 0;
            for (int k = 0; k < stringArray[j].length; k++){
                if(!Objects.equals(stringArray[j][k], "")) {
                    for(int l = stringArray[j][k].length(); l > 0; l--){
                        count += l;
                    }
                }
            }
            if(j != stringArray.length - 1) {
                result = count + "\n";
            }
            else{
                result = String.valueOf(count);
            }
            bw.write(result);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}