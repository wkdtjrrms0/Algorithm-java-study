import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'c' && i < s.length() - 1){
                if(s.charAt(i + 1) == '='){
                    count++;
                    i++;
                    continue;
                }
                if(s.charAt(i + 1) == '-'){
                    count++;
                    i++;
                    continue;
                }
            }
            else if(s.charAt(i) == 'd' && i < s.length() - 1){
                if(s.charAt(i + 1) == 'z' && i < s.length() - 2){
                    if(s.charAt(i + 2) == '='){
                        count++;
                        i += 2;
                        continue;
                    }
                }
                if(s.charAt(i + 1) == '-'){
                    count++;
                    i++;
                    continue;
                }
            }
            else if(s.charAt(i) == 'l' && i < s.length() - 1){
                if(s.charAt(i + 1) == 'j'){
                    count++;
                    i++;
                    continue;
                }
            }
            else if(s.charAt(i) == 'n' && i < s.length() - 1){
                if(s.charAt(i + 1) == 'j'){
                    count++;
                    i++;
                    continue;
                }
            }
            else if(s.charAt(i) == 's' && i < s.length() - 1){
                if(s.charAt(i + 1) == '='){
                    count++;
                    i++;
                    continue;
                }
            }
            else if(s.charAt(i) == 'z' && i < s.length() - 1){
                if(s.charAt(i + 1) == '='){
                    count++;
                    i++;
                    continue;
                }
            }
            count++;
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}