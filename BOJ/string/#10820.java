import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null){
            System.out.println(String.join(" ", String.valueOf(inspect(str)[0]), String.valueOf(inspect(str)[1]), String.valueOf(inspect(str)[2]), String.valueOf(inspect(str)[3])));
        }
        br.close();
    }

    static int[] inspect(String str){
        int[] result = new int[4];
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                result[0]++;
                continue;
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                result[1]++;
                continue;
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                result[2]++;
                continue;
            }
            if(str.charAt(i) == ' '){
                result[3]++;
            }
        }
        return result;
    }
}