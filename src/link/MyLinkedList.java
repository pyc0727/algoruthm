package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/23 10:08
 * @Description:
 **/
public class MyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.size = 0;
        head = new ListNode();
        tail = head;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode node = head;
        for (int i = 0; i <= index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        if(tail.equals(head)){
            tail = head.next;
        }
        size++;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        if (index >= size) {
            addAtTail(val);
            return;
        }
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        ListNode n = new ListNode(val);
        n.next = node.next;
        node.next = n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);
    }
}
