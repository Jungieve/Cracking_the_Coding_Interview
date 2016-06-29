package List;

/**
 * Created by root on 2016/6/29.
 */
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null || pHead.next == null)	return pHead;
        ListNode smaller = new ListNode(0);
        ListNode dummySmaller = smaller;
        ListNode bigger = new ListNode(0);
        ListNode dummyBigger = bigger;
        while(pHead!=null){
            if(pHead.val < x){
                smaller.next = new ListNode(pHead.val);
                smaller = smaller.next;
            }
            else{
                bigger.next = new ListNode(pHead.val);
                bigger = bigger.next;
            }
            pHead = pHead.next;
        }
        smaller.next = dummyBigger.next;
        return dummySmaller.next;
    }
}