package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/12.
 */
public class SameTest {
    Same same;
    String stringA;
    String stringB;
    boolean result;
    @Before
    public void setUp() throws Exception {
        same = new Same();
        stringA = "This is nowcoder";
        stringB = "is This nowcoder";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testCheckSam() throws Exception {
        result = same.checkSam(stringA,stringB);
    }
}