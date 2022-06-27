import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static ArrayList<ArrayList<Integer>> arr;
    static boolean[] check;

    public static void dfs(int node) throws IOException {
        check[node] = true;
        for(int i = 0; i < arr.get(node).size(); i++){
            int next = arr.get(node).get(i);
            if(!check[next]){
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new ArrayList<ArrayList<Integer>>(N + 1);
        for(int i = 0; i <= N; i++){
            arr.add(i, new ArrayList<Integer>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            arr.get(p1).add(p2);
            arr.get(p2).add(p1);
        }
        check = new boolean[N+1];
        int components = 0;
        for(int i = 1; i <= N; i++){
            if(!check[i]){
                dfs(i);
                components += 1;
            }
        }
        bw.write(String.valueOf(components));
        bw.flush();
        br.close();
        bw.close();
    }
}