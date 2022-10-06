package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 17:34
 * @Description:
 **/
public class Q430 {
    public Node flatten(Node head) {
        Node node = head;
        while(node != null){
            if(node.child == null){
                node = node.next;
            }else{
                Node temp = node;
                node = node.next;
                temp.next = temp.child;
                getChilr(node.child).next = node.next;
            }
        }
        return head;
    }

    public Node getChilr(Node node){
        while(node.next != null){
            if(node.child != null){
                getChilr(node);
            }
        }
        return node;
    }
}
