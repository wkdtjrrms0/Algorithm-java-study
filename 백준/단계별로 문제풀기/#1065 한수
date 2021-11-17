import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if(sameGap(digit(j)) == 1){
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static int[] digit(int n) {
        // 넘어온 숫자를 자리수마다 배열로 담아 리턴
        int[] digit = new int[4];
        digit[0] = n % 10; // 1의 자리
        digit[1] = (n % 100) / 10; // 10의 자리
        digit[2] = (n % 1000) / 100; // 100의 자리
        digit[3] = (n % 10000) / 1000; // 1000의 자리
        return digit;
    }
    static int sameGap(int[] digit) {
        // 공차가 같은지 계산
        if(digit[3] > 0){
            if(gap(digit[3], digit[2]) == gap(digit[2], digit[1])){
                if(gap(digit[2], digit[1]) == gap(digit[1], digit[0])){
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        if(digit[2] > 0){
            if(gap(digit[2], digit[1]) == gap(digit[1], digit[0])) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    static int gap(int digit1, int digit2){
        //공차 계산
        return digit1 - digit2;
    }
}