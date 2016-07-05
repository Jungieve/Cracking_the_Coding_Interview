package Stack_Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/7/5.
 */
public class TwoStacksTest {
    TwoStacks twoStacks;
    ArrayList<Integer> result;
    @Before
    public void setUp() throws Exception {
        twoStacks = new TwoStacks();
        result = new ArrayList();
    }

    @After
    public void tearDown() throws Exception {
        for (int t:result
             ) {
            System.out.print(t+" ");
        }
    }

    @Test
    public void testTwoStacksSort() throws Exception {
        result = twoStacks.twoStacksSort(new int[]{2,2});
    }
}