import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < str.length(); i++){
            left.push(str.charAt(i));
        }
        String cmd;
        for(int i = 0; i < num; i++){
            cmd = br.readLine();
            if(cmd.charAt(0) == 'L'){
                if(!left.isEmpty()) {
                    right.push(left.pop());
                }
            }
            else if(cmd.charAt(0) == 'D'){
                if(!right.isEmpty()) {
                    left.push(right.pop());
                }
            }
            else if(cmd.charAt(0) == 'B'){
                if(!left.isEmpty()) {
                    left.pop();
                }
            }
            else if(cmd.charAt(0) == 'P'){
                left.push(cmd.charAt(2));
            }
        }
        int ls = left.size();
        for(int i = 0; i < ls; i++){
            right.push(left.pop());
        }
        int rs = right.size();
        for(int i = 0; i < rs; i++){
            bw.write(right.pop());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}