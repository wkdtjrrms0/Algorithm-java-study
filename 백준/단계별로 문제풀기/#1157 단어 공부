import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        byte[] strByte = str.getBytes();
        int count = 0;
        int[] Alpha = new int[26];
        for(byte i: strByte){
            if(i >= 97){
                strByte[count] = (byte) (i - 32);
                Alpha[i - 97]++;
            }
            else{
                Alpha[i - 65]++;
            }
            count++;
        }

        int max = Alpha[0];
        int index = -1;
        for(int i = 0; i < Alpha.length; i++){
            if(Alpha[i] >= max){
                max = Alpha[i];
                index = i;
            }
        }

        int arrCount = 0;
        for(int i: Alpha){
            if(max == i){
                arrCount++;
            }
        }
        if(arrCount == 1){
            bw.write(Character.toString(index + 65));
        }
        else{
            bw.write("?");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}