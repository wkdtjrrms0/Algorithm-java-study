import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Objects;
/**
 * Info: BOJ#2164 카드2
 * Ref: https://www.acmicpc.net/problem/2164
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayDeque<Integer> cards = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = N; i > 0; i--) {
            cards.offerLast(i);
        }

        while (true) {
            if (cards.size() == 1) {
                break;
            }
            cards.pollLast();
            if (cards.size() == 1) {
                break;
            }
            cards.offerFirst(Objects.requireNonNull(cards.pollLast()));
        }

        bw.write(Integer.toString(cards.pollFirst()));
        bw.flush();
        br.close();
        bw.close();
    }
}