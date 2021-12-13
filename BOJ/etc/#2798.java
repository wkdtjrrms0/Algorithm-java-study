import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cardNum = new int[N];
        for(int i = 0; i < N; i++){
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        int gap = 0;
        int minGap = 299997;
        for(int i = 0; i < N - 2; i++){
            for(int j = i + 1; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    gap = M - (cardNum[i] + cardNum[j] + cardNum[k]);
                    if(gap >= 0){
                        if(gap <= minGap){
                            minGap = gap;
                        }
                    }
                }
            }
        }
        bw.write(Integer.toString(M - minGap));
        bw.flush();
        bw.close();
        br.close();
    }
}