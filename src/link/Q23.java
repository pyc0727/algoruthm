package link;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 14:53
 * @Description:
 **/
public class Q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists,0,lists.length);
    }

    public ListNode mergeKLists(ListNode[] lists,int start,int end){
        if(start > end) return null;
        if(start == end) return lists[start];
        if(start +1 == end)return mergeTwoLists(lists[start],lists[end]);
        int mid = (start + end)/2;
        return mergeTwoLists(mergeKLists(lists,start,mid),mergeKLists(lists,mid+1,end));
    }

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
