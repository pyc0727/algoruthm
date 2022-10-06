package link;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 14:19
 * @Description:
 **/
public class Q445 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        while(l1 != null){
            deque1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            deque2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode ans = null;
        while(!deque1.isEmpty() || !deque2.isEmpty() || carry!=0){
            int a = deque1.isEmpty()?0:deque1.pop();
            int b = deque2.isEmpty()?0:deque2.pop();
            int num = a + b + carry;
            ListNode val = new ListNode(num%10);
            val.next = ans;
            ans = val;
            carry = num/10;
        }
        return ans;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(2);
        addTwoNumbers(l1,l2);

    }
}
