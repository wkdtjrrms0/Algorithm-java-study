import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static ArrayList<Integer>[] arr;
    static boolean[] c;

    public static void dfs(int start) throws IOException {
        if (c[start]) {
            return;
        }
        c[start] = true;
        bw.write(start + " ");
        for (int y : arr[start]) {
            if (!c[y]) {
                dfs(y);
            }
        }
    }
    public static void bfs(int start) throws IOException {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        c[start] = true;
        while (!q.isEmpty()) {
            start = q.remove();
            bw.write(start + " ");
            for (int y : arr[start]) {
                if (!c[y]) {
                    c[y] = true;
                    q.add(y);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        arr = (ArrayList<Integer>[]) new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            arr[p1].add(p2);
            arr[p2].add(p1);
        }
        for (int i=1; i<=N; i++) {
            Collections.sort(arr[i]);
        }
        c = new boolean[N+1];
        dfs(V);
        bw.write("\n");
        c = new boolean[N+1];
        bfs(V);
        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();
    }
}