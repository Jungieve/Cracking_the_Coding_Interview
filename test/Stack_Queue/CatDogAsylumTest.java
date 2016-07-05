package Stack_Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/7/5.
 */
public class CatDogAsylumTest {
    CatDogAsylum catDogAsylum;
    ArrayList<Integer> result;
    @Before
    public void setUp() throws Exception {
        catDogAsylum = new CatDogAsylum();
        result = new ArrayList();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAsylum() throws Exception {
        catDogAsylum.asylum(new int[][]{});
    }
}