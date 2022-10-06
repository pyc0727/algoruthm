package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/15 10:20
 * @Description:
 **/
public class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head.next == null){
            return head;
        }
        int len = 0;
        ListNode count =head;
        while(count != null){
            len++;
            count = count.next;
        }
        k = k%len;
        ListNode r = head;
        ListNode l = head;
        for (int i = 0; i < k; i++) {
            r = r.next;
        }
        while(r.next != null){
            l  = l.next;
            r = r.next;
        }
        ListNode ans = l.next;
        r.next = head;
        l.next = null;
        return ans;
    }
}
