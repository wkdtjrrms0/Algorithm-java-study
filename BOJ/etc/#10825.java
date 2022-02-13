import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];

        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(Objects.equals(o1[1], o2[1])){
                if(Objects.equals(o1[2], o2[2])){
                    if(Objects.equals(o1[3], o2[3])){
                        return o1[0].compareTo(o2[0]);
                    } else {
                        return -(Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]));
                    }
                } else {
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
            } else {
                return -(Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]));
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< N ; i++) {
            sb.append(arr[i][0]).append('\n');
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}