import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Point[] arr = new Point [N + 1];
        for(int i = 1; i <= N; i++){
            arr[i] = new Point(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr, 1, N + 1);

        int max = 0;
        for(int i = 1; i <= N; i++){
            if(max < arr[i].idx - i){
                max = arr[i].idx - i;
            }
        }
        bw.write(String.valueOf(max + 1));
        bw.flush();
        bw.close();
        br.close();
    }
}

class Point implements Comparable<Point>{
    int val;
    int idx;

    public Point(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }


    @Override
    public int compareTo(Point a){
        return this.val - a.val;
    }
}