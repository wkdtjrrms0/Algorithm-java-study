import java.util.Scanner;

public class Main {
    public static boolean[] test;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        test = new boolean[N + 1];
        get_test();
        for(int i = M; i <= N; i++) {
            if(!test[i]) System.out.println(i);
        }
    }
    public static void get_test() {
        test[0] = test[1] = true;
        for(int i = 2; i <= Math.sqrt(test.length); i++) {
            if(test[i]) continue;
            for(int j = i * i; j < test.length; j += i) {
                test[j] = true;
            }
        }
    }
}