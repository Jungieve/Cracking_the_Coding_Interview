package List;

import java.util.Stack;

/**
 * Created by root on 2016/6/30.
 */
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        if(pHead == null)	return false;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Stack<Integer> stack = new Stack();
        while(slow!=null){
            stack.push(slow.val);
            slow = slow.next;
        }
        while(stack.size()!=0 && stack.peek() == pHead.val ){
            stack.pop();
            pHead = pHead.next;
        }
        return (stack.size() <= 1);
    }
}