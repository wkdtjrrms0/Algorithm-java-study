import java.io.*;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Queue <Integer> queue = new LinkedList<>();
        String input;
        String back ="";

        for(int i = 0; i < num; i++){
            input = br.readLine();

            if(Objects.equals(input.split(" ")[0], "push")){
                queue.offer(Integer.parseInt(input.split(" ")[1]));
                back = input.split(" ")[1];
            }
            else if(Objects.equals(input.split(" ")[0], "pop")){
                if(queue.size() == 0){
                    bw.write("-1");
                }
                else{
                    bw.write(String.valueOf(queue.poll()));
                }
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "size")){
                bw.write(String.valueOf(queue.size()));
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "empty")){
                if(queue.size() == 0){
                    bw.write("1");
                }
                else{
                    bw.write("0");
                }
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "front")){
                if(queue.size() == 0){
                    bw.write("-1");
                }
                else{
                    bw.write(String.valueOf(queue.peek()));
                }
                bw.write("\n");
            }
            else if(Objects.equals(input.split(" ")[0], "back")){
                if(queue.size() == 0){
                    bw.write("-1");
                }
                else{
                    bw.write(back);
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}