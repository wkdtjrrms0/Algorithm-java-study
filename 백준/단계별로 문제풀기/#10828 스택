import java.io.*;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            input = br.readLine();
            if(Objects.equals(input.split(" ")[0], "push")){
                stack.push(Integer.parseInt(input.split(" ")[1]));
            }
            else if(Objects.equals(input.split(" ")[0], "pop")){
                if(stack.empty()){
                    bw.write("-1");
                }
                else{
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "size")){
                bw.write(String.valueOf(stack.size()));
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "empty")){
                if(stack.empty()){
                    bw.write("1");
                }
                else{
                    bw.write("0");
                }
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "top")){
                if(stack.empty()){
                    bw.write("-1");
                }
                else{
                    bw.write(String.valueOf(stack.peek()));
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}