package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/15 16:15
 * @Description:
 **/
public class Q92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head == null || head.next == null)return head;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode l = start;
        ListNode r = head;
        for (int i = 0; i < left - 1; i++) {
            l = l.next;
        }
        for (int i = 1; i < right; i++) {
            r = r.next;
        }
        ListNode prev = null;
        ListNode cur =  l.next;
        ListNode end = l.next;
        ListNode next = l.next.next;
        int count = right - left +1;
        for (int i = 0; i < count; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        end.next = cur;
        l.next = prev;
        return start.next;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        reverseBetween(node,2,4);
    }
}
