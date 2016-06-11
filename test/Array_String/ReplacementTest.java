package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/12.
 */
public class ReplacementTest {
    Replacement replacement;
    String initString;
    int n;
    String result;
    @Before
    public void setUp() throws Exception {
        replacement = new Replacement();
        initString = "Mr John Smith";
        n = 13;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testReplaceSpace() throws Exception {
        result = replacement.replaceSpace(initString,n);
    }
}