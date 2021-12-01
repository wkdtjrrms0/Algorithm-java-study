import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push(i);
            }
            else if (input.charAt(i) == ')'){
                if(i - stack.pop() == 1){
                    result += stack.size();
                }
                else{
                    result++;
                }
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}