package List;

/**
 * Created by ZihanCong on 16/6/14.
 */
public class Remove {
    public ListNode removeNode(ListNode head,ListNode pNode) {
        // write code here
        ListNode dummy = head;
        ListNode prev = null;
        while(head != null){
            if(pNode.val == head.val){
                //第一个节点
                if(prev == null){
                    dummy = head.next;
                }
                else{
                    prev.next = head.next;
                }
                head = null;
                return dummy;
            }
            else {
                prev = head;
                head = head.next;
            }
        }
        return null;
    }
}
