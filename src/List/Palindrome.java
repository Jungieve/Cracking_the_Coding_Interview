package List;

/**
 * Created by root on 2016/6/30.
 */
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if(pHead == null)	return false;
        //获取链表长度
        ListNode pLength = pHead;
        //记录链表长度
        int length = 0;
        while(pLength!=null){
            pLength = pLength.next;
            length++;
        }
        //额外链表
        ListNode extra = new ListNode(0);
        ListNode dummy = extra;

        //移动到extra
        for(int i = 0;i<length/2;i++){
            ListNode temp = new ListNode(pHead.val);
            temp.next = dummy;
            dummy = temp;
            pHead = pHead.next;
        }
        pHead = (length%2 == 0)?pHead:(pHead.next);
        while(dummy!=null && pHead!= null && dummy.val == pHead.val){
            dummy = dummy.next;
            pHead = pHead.next;
        }
        return (pHead == null);

    }
}