import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Info: Leetcode#1700 Number of Students Unable to Eat Lunch
 * Ref: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // case 1
//		int[] students = {1,1,0,0}; int[] sandwiches = {0,1,0,1};
        // case 2
        int[] students = {1,1,1,0,0,1}; int[] sandwiches = {1,0,0,0,1,1};

        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Stack<Integer> sandwich = new Stack<>();

        for(int s : students) {
            student.offer(s);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwich.push(sandwiches[i]);
        }

        int remainSandwich = sandwiches.length;
        int remainStudent = students.length;
        for(int i = 0; i < remainStudent; i++) {
            int studentPrefer = student.poll();
            if (studentPrefer == sandwich.peek()) {
                sandwich.pop();
                remainSandwich--;
                i = 0;
                remainStudent = students.length;
                if (remainSandwich == 0) {
                    break;
                }
            } else {
                student.offer(studentPrefer);
            }
        }

        return remainSandwich;
    }
}