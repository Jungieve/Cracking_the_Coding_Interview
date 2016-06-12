package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/6/12.
 */
public class ZipperTest {
    Zipper zipper;
    String initString;
    String result;
    @Before
    public void setUp() throws Exception {
        zipper = new Zipper();
        initString = "aabcccccaaa";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(result);
    }

    @Test
    public void testZipString() throws Exception {
        result = zipper.zipString(initString);
    }
}