package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/6/12.
 */
public class ClearerTest {
    Clearer clearer;
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    @Before
    public void setUp() throws Exception {
        clearer = new Clearer();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testClearZero() throws Exception {
        clearer.clearZero(mat,3);
    }
}