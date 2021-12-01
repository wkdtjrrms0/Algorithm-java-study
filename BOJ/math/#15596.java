import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long test;
        int[] a = {1, 2, 3};
        test = sum(a);
        bw.write(Long.toString(test));
        bw.flush();
        bw.close();
        br.close();
    }

    static long sum(int[] a) {
        long sum = 0;    // a 배열 정수 합 변수

        for (int j : a) {
            sum += j;
        }
        return sum;
    }

}