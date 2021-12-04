import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> al = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;

        for(int i = 1; i <= N; i++){
            al.add(i);
        }
        int index = 0;
        bw.write("<");
        while(al.size() > 1){
            index += K;
            while (index > al.size() - 1) {
                index -= al.size();
            }
            bw.write(al.remove(index) + ", ");
        }
        bw.write(al.remove(0) + ">");
        bw.flush();
        bw.close();
        br.close();
    }
}