import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Info: BOJ#1931 회의실 배정
 * Ref: https://www.acmicpc.net/problem/1931
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);
        int result = 0;
        int lastEndTime = 0;
        for (Meeting m : list) {
            if(m.startTime >= lastEndTime) {
                result++;
                lastEndTime = m.endTime;
            }
        }
        System.out.println(result);
        br.close();
    }

    static class Meeting implements Comparable<Meeting> {
        int startTime;
        int endTime;

        Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.endTime == o.endTime) {
                return this.startTime - o.startTime;
            }
            return this.endTime - o.endTime;
        }
    }
}