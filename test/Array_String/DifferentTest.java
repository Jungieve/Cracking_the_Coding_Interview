package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/12.
 */
public class DifferentTest {
    Different different ;
    String inputString;
    boolean result;
    @Before
    public void setUp() throws Exception {
        different = new Different();
        inputString = "aeiou";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testCheckDifferent() throws Exception {
        result = different.checkDifferent(inputString);
    }
}