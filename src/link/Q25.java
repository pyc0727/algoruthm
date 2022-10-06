package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/15 16:38
 * @Description:
 **/
public class Q25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;
        int len = 0;
        ListNode length = head;
        while(length != null){
            len++;
            length = length.next;
        }
        int times = len/k;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode prev = start;
        ListNode cur = head;
        ListNode next = head.next;
        for (int i = 0; i < times; i++) {
            ListNode first = prev;
            ListNode end = cur;
            for (int w = 0; w < k; w++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if(next != null)
                next = next.next;
            }
            first.next = prev;
            end.next = cur;
            prev = end;
        }
        return start.next;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
        node.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        reverseKGroup(node, 2);
    }
}
