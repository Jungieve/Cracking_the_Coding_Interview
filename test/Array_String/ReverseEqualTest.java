package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/6/12.
 */
public class ReverseEqualTest {
    ReverseEqual reverse;
    String s1;
    String s2;
    boolean result;
    @Before
    public void setUp() throws Exception {
        reverse = new ReverseEqual();
        s1 = "Hello world";
        s2 = "worldHello ";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testCheckReverseEqual() throws Exception {
        result = reverse.checkReverseEqual(s1,s2);
    }
}