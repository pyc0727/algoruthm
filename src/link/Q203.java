package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 16:56
 * @Description:
 **/
public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode listNode = new ListNode(1);
        listNode.next = head;
        ListNode start = listNode;
        while(listNode.next != null){
            if(listNode.next.val == val){
                listNode.next = listNode.next.next;
            }else {
                listNode = listNode.next;
            }
        }
        return start;

    }
}
