package List;

/**
 * Created by ZihanCong on 16/6/14.
 */
public class Reciprocal_K {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <= 0)
            return null;
        ListNode dummy = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for(int i=0;i<k-1;i++){
            fast = fast.next;
            if(fast == null)
                return null;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}
