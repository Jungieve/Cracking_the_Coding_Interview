package List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/7/2.
 */
public class PlusTest {
    Plus plus = new Plus();
    ListNodeSequence listNodeSequence1;
    ListNodeSequence listNodeSequence2;
    ListNode result ;
    ListNodeSequence resultShow;
    @Before
    public void setUp() throws Exception {
        listNodeSequence1 = new ListNodeSequence(new int[]{1,2,3});
        listNodeSequence2 = new ListNodeSequence(new int[]{4,2,3});
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testPlusAB() throws Exception {
        result = plus.plusAB(listNodeSequence1.head,listNodeSequence2.head);

    }
}