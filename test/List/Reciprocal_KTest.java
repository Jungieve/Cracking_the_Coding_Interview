package List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/14.
 */
public class Reciprocal_KTest {
    Reciprocal_K reciprocal_k = new Reciprocal_K();
    ListNode listNode ;
    int result;
    @Before
    public void setUp() throws Exception {
        listNode = new ListNode(0);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testFindKthToTail() throws Exception {
        result = reciprocal_k.FindKthToTail(listNode,2).val;
    }
}