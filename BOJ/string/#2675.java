import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++){
            String s = strOut(br.readLine());
            bw.write(s);
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static String strOut(String s){
        String[] strArr;
        strArr = s.split(" ");
        return repeatStr(Integer.parseInt(strArr[0]), strArr[1]);
    }

    static String repeatStr(int repeat, String str){
        StringBuilder result = new StringBuilder();
        String[] strPieceArr = cutStr(str);
        for (String s : strPieceArr) {
            result.append(String.valueOf(s).repeat(Math.max(0, repeat)));
        }
        result.append("\n");
        return result.toString();
    }

    static String[] cutStr(String str){
        return str.split("");
    }
}