import java.math.BigInteger;
import java.util.*;

/**
 * Info: Leetcode#2 Add Two Numbers
 * Ref: https://leetcode.com/problems/add-two-numbers
 */
public class Main {
    public static void main(String[] args) {
        // CASE 1
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // CASE 2
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(0);
        // CASE 3
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9
                , new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        System.out.println(addTwoNumbers(l1, l2).toString());
    }
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1String = new StringBuilder();
        StringBuilder l2String = new StringBuilder();
        l1String.append(l1.val);
        while (l1.next != null) {
            l1String.append(l1.next.val);
            l1 = l1.next;
        }
        l2String.append(l2.val);
        while (l2.next != null) {
            l2String.append(l2.next.val);
            l2 = l2.next;
        }

        BigInteger l1Long = new BigInteger(l1String.reverse().toString());
        BigInteger l2Long = new BigInteger(l2String.reverse().toString());
        String answerLong = String.valueOf(l1Long.add(l2Long));
        ListNode answerNode = new ListNode(Character.getNumericValue(answerLong.charAt(0)));
        for(int i = 1; i < answerLong.length(); i++) {
            answerNode = new ListNode(Character.getNumericValue(answerLong.charAt(i)), answerNode);
        }

        return answerNode;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(this.val);
            ListNode nextNode = this.next;
            while(nextNode != null) {
                sb.append(',');
                sb.append(nextNode.val);
                nextNode =  nextNode.next;
            }
            sb.append(']');
            return sb.toString();
        }
    }
}