import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Info: BOJ#2805 나무 자르기
 * Ref: https://www.acmicpc.net/problem/2805
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] trees = new int[N];
		for (int i = 0; i < N; i++) {
			trees[i] = sc.nextInt();
		}
		System.out.println(solution(trees, M, N));
	}

	public static int solution(int[] trees, int M, int N) {
		Arrays.sort(trees);

		int left = 0;
		int right = trees[N - 1];
		int answer = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (getSumCuttedTreeLength(trees, mid) >= M) {
				answer = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return answer;
	}

	public static long getSumCuttedTreeLength(int[] trees, int mid) {
		long sumCuttedTreeLength = 0;
		for (int i = 0; i < trees.length; i++) {
			if (trees[i] > mid) {
				sumCuttedTreeLength += (trees[i] - mid);
			}
		}
		return sumCuttedTreeLength;
	}
}