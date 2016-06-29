package List;

/**
 * Created by ZihanCong on 16/6/15.
 */
public class ListNodeSequence {
    private ListNode insertedNode = null;
    ListNode head = null;
    public ListNodeSequence(int[] t) {
        for (int i = 0;i<t.length;i++) {
            if(i == 0) {
                insertedNode = new ListNode(t[i]);
                head = insertedNode;
            }
            else{
                ListNode newNode = new ListNode(t[i]);
                insertedNode.next = newNode;
                insertedNode = insertedNode.next;
            }

        }
    }

    public void print() {
        ListNode dummy = head;
        while (dummy != null) {
            if (dummy.next == null)
                System.out.print(dummy.val);
            else
                System.out.print(dummy.val + "-->");
            dummy = dummy.next;
        }
    }
}
