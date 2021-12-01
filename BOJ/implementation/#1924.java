import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int D = Integer.parseInt(str[1]);
        String[][] Cal = new String[12][31];
        String[] dayOfTheWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int d = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 31; j++){
                Cal[i][j] = dayOfTheWeek[d];
                d++;
                if(d == 7){
                    d = 0;
                }

                if(i == 1 && j == 27){
                    break;
                }
                else if(i == 3 && j == 29){
                    break;
                }
                else if(i == 5 && j == 29){
                    break;
                }
                else if(i == 8 && j == 29){
                    break;
                }
                else if(i == 10 && j == 29){
                    break;
                }
            }
        }
        bw.write(Cal[M - 1][D - 1]);
        bw.flush();
        bw.close();
        br.close();
    }
}