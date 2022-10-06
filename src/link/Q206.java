package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/15 10:37
 * @Description:
 **/
public class Q206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;
        while(cur != null){
            cur.next = prev;
            prev = cur;
            cur = next;
           if(cur != null){
               next = next.next;
           }
        }
        return prev;

    }
}
