package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/15 10:32
 * @Description:
 **/
public class Q24 {
    public ListNode swapPairs(ListNode head) {
        ListNode start = new ListNode(1);
        start.next = head;
        ListNode cur = start;
        while(cur.next != null & cur.next.next != null){
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            second.next = first;
            cur.next = second;
            cur = first;
        }
        return start.next;

    }
}
