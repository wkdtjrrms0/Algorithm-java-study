import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input;


        for(int i = 0; i < n; i++){
            input = br.readLine();
            if(inspect(input)){
                bw.write("YES");
            }
            else{
                bw.write("NO");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
    static boolean inspect(String s){
        Stack<Character> stack = new Stack<>();
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '('){
                stack.push(s.charAt(j));
            }
            else{
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}