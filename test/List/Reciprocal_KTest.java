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
    ListNodeSequence listNodeSequence;
    int result;
    @Before
    public void setUp() throws Exception {
        listNodeSequence = new ListNodeSequence(new int[]{1,2,3,4,5});
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testFindKthToTail() throws Exception {
        result = reciprocal_k.FindKthToTail(listNodeSequence.head,2).val;
    }
}