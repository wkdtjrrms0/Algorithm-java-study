import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        byte[] numStr = br.readLine().getBytes();
        int sumTime = 0;
        for(byte i: numStr){
            sumTime += time(i);
        }
        bw.write(String.valueOf(sumTime));
        bw.flush();
        bw.close();
        br.close();
    }
    static int time(byte i){
        if(65 <= i && i < 68){ //2
            return 3;
        } else if(68 <= i && i < 71){ //3
            return 4;
        } else if(71 <= i && i < 74){ //4
            return 5;
        } else if(74 <= i && i < 77){ //5
            return 6;
        } else if(77 <= i && i < 80){ //6
            return 7;
        } else if(80 <= i && i < 84){ //7
            return 8;
        } else if(84 <= i && i < 87){ //8
            return 9;
        } else if(87 <= i && i < 91){ //9
            return 10;
        } else{
            return 0;
        }
    }
}