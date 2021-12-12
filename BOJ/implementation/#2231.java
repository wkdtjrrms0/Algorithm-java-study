import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int disNum;
        for(int i = 1; i <= num; i++){
            disNum = 0;
            disNum += i + (i % 10) + ((i % 100) / 10) + ((i % 1000) / 100) + ((i % 10000) / 1000) + ((i % 100000) / 10000) + ((i % 1000000) / 100000) + ((i % 10000000) / 1000000);
            if(disNum == num){
                bw.write(Integer.toString(i));
                break;
            }
            if(i == num){
                bw.write(Integer.toString(0));
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}