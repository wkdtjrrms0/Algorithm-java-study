import java.io.IOException;
import java.util.Scanner;

/**
 * Info: Programmers#340206 [PCCE 기출문제] 2번 / 각도 합치기
 * Ref: https://school.programmers.co.kr/learn/courses/30/lessons/340206?language=java
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle - (360 * (sum_angle/360)));
    }
}