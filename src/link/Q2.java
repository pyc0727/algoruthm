package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 11:17
 * @Description:
 **/
public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null?0:l1.val;
            int val2 = l2 == null?0:l2.val;
            int num = val1 + val2 + flag;
            ListNode node = new ListNode(num % 10);
            flag = num / 10;
            cur.next = node;
            cur = node;
            if(l1 !=null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }
        if(flag == 1)cur.next = new ListNode(1);
        return ans.next;
    }
}
