import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Info: BOJ#7568 덩치
 * Ref: https://www.acmicpc.net/problem/7568
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < people.size(); i++) {
            int cnt = 0;
            for (int j = 0; j < people.size(); j++) {
                if (i != j && people.get(i).getWeight() < people.get(j).getWeight() && people.get(i).getHeight() < people.get(j).getHeight()) {
                    cnt++;
                }
            }
            people.get(i).setRank(cnt + 1);
        }

        String result = people.stream()
            .map(person -> String.valueOf(person.getRank()))
            .collect(Collectors.joining(" "));

        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }

    static class Person {
        private int weight;
        private int height;
        private int rank;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
        public int getWeight() {
            return weight;
        }
        public int getHeight() {
            return height;
        }
        public int getRank() {
            return rank;
        }
        public void setRank(int rank) {
            this.rank = rank;
        }
    }
}