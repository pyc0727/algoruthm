package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 17:09
 * @Description:
 **/
public class Q237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
