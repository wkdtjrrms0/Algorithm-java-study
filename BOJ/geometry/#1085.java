import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> ar = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            ar.add(Integer.parseInt(st.nextToken()));
        }

        int[] dis = new int[4];
        dis[0] = ar.get(2) - ar.get(0);
        dis[1] = ar.get(3) - ar.get(1);
        dis[2] = ar.get(0);
        dis[3] = ar.get(1);

        Arrays.sort(dis);
        bw.write(Integer.toString(dis[0]));
        bw.flush();
        bw.close();
        br.close();
    }
}