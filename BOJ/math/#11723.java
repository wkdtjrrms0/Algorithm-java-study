import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Info: BOJ#11723 집합
 * Ref: https://www.acmicpc.net/problem/11723
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int bitMask = 0;

        while(M-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            int num;

            switch (op){
                case "add" :
                    num = Integer.parseInt(st.nextToken());
                    bitMask |= (1 << (num - 1));
                    break;
                case "remove" :
                    num = Integer.parseInt(st.nextToken());
                    bitMask = bitMask & ~(1 << (num - 1));
                    break;
                case "check" :
                    num = Integer.parseInt(st.nextToken());
                    sb.append((bitMask & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle" :
                    num = Integer.parseInt(st.nextToken());
                    bitMask ^= (1 << (num - 1));
                    break;
                case "all" :
                    bitMask |= (~0);
                    break;
                case "empty" :
                    bitMask &= 0;
                    break;
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}