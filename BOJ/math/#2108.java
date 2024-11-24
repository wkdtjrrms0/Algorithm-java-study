import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * Info: BOJ#2108 통계학
 * Ref: https://www.acmicpc.net/problem/2108
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        // 1. 산술평균
        bw.write(avg(nums) + "\n");
        // 2. 중앙값
        bw.write(centerVal(nums) + "\n");
        // 3. 최빈값
        bw.write(frequentVal(nums) + "\n");
        // 4. 범위
        bw.write(Integer.toString(range(nums)));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int avg (int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (int) Math.round(sum / nums.length);
    }

    private static int centerVal (int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private static int frequentVal(int[] nums) {
        Arrays.sort(nums);  // 배열을 오름차순으로 정렬

        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;

        for(int i = 0; i < nums.length; i++) {
            int jump = 0;
            int count = 1;
            int i_value = nums[i];

            for(int j = i + 1; j < nums.length; j++){
                if(i_value != nums[j]) {
                    break;
                }
                count++;
                jump++;
            }

            if(count > mode_max) {
                mode_max = count;
                mode = i_value;
                flag = true;
            }
            else if(count == mode_max && flag) {
                mode = i_value;
                flag = false;
            }

            i += jump;
        }

        return mode;
    }

    private static int range (int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }
}