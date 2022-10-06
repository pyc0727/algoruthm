package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 17:27
 * @Description:
 **/
public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(1);
        start.next = head;
        ListNode r = head;
        for (int i = 0; i < n; i++) {
            r = r.next;
        }
        ListNode l = start;
        while(r != null){
            r = r.next;
            l = l.next;
        }
        l.next = l.next.next;
        return start.next;

    }
}
