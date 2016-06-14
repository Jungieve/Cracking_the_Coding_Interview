package List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/15.
 */
public class RemoveTest {
    Remove remove = new Remove();
    ListNodeSequence listNodeSequence;
    @Before
    public void setUp() throws Exception {
        listNodeSequence = new ListNodeSequence(new int[]{1,2,3,4,5});
    }

    @After
    public void tearDown() throws Exception {
        listNodeSequence.print();
    }

    @Test
    public void testRemoveNode() throws Exception {
        ListNode head = listNodeSequence.head;
        remove.removeNode(head,new ListNode(5));
    }
}