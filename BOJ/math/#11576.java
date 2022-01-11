import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); //A진법
        int B = Integer.parseInt(st.nextToken()); //B진법
        int m = Integer.parseInt(br.readLine()); //A진법으로 나타낸 숫자의 자리수의 개수(1 <= m <= 25)
        st = new StringTokenizer(br.readLine());
        int tmp = 0;
        for(int i = 0; i < m; i++){
            tmp += Integer.parseInt(st.nextToken()) * (int) Math.pow(A, m - i - 1);
        }
        if(m == 1 && tmp == 0){
            bw.write(String.valueOf(0));
        }
        else {
            Stack<Integer> stack = new Stack<>();
            while(tmp != 0){
                stack.push(tmp % B);
                tmp /= B;
            }
            while (!stack.isEmpty()) {
                if (stack.size() == 1) {
                    System.out.println(stack.peek());
                } else {
                    System.out.print(stack.peek() + " ");
                }
                stack.pop();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}