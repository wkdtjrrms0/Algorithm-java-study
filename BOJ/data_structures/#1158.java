import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue <Integer> queue = new LinkedList<>();
        String input = br.readLine();

        for(int i = 1; i <= Integer.parseInt(input.split(" ")[0]); i++){
            queue.offer(i);
        }

        int tmp;
        bw.write("<");
        while(queue.size() != 0){
            for(int i = 0; i < Integer.parseInt(input.split(" ")[1]) - 1; i++) {
                queue.offer(queue.poll());
            }
            tmp = queue.poll();
            if(queue.size() != 0) {
                bw.write(tmp + ", ");
            }
            else{
                bw.write(tmp + ">");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}