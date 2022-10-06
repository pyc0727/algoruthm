package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/27 22:04
 * @Description:
 **/
public class Q138 {
    public Node copyRandomList(Node head) {
        if(head == null)return head;
        Map<Node,Node> map = new HashMap<>();
        Node start = new Node(head.val);
        Node h = head;
        Node copy = start;
        map.put(head,copy);
        while(head.next != null ){
            h = h.next;
            copy.next = new Node(head.val);
            copy = copy.next;
            map.put(h,copy);
        }
        Node hh = head;
        Node cc = start;
        while(hh != null){
            cc.random = Objects.isNull(hh.random)?null:map.get(hh.random);
            hh = hh.next;
            cc = cc.next;
        }
        return start;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
