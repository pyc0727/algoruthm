package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 14:43
 * @Description:
 **/
public class Q21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if( list1 == null || list2== null)return list1==null?list2:list1;
        ListNode ans = new ListNode();
        ListNode cur = ans;
        while(list1 != null && list2!= null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1==null?list2:list1;
        return ans.next;

    }
}
