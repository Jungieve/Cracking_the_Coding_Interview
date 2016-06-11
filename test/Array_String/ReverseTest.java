package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/12.
 */
public class ReverseTest {
    Reverse reverse;
    String iniString;
    String result;
    @Before
    public void setUp() throws Exception {
        reverse = new Reverse();
        iniString = "Hello world";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testReverseString() throws Exception {
        result = reverse.reverseString(iniString);
    }
}