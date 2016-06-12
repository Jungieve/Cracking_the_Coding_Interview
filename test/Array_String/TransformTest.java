package Array_String;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/6/12.
 */
public class TransformTest {
    Transform transform;
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    @Before
    public void setUp() throws Exception {
        transform = new Transform();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTransformImage() throws Exception {
        transform.transformImage(mat,3);
    }
}