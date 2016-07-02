package List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/6/30.
 */
public class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    ListNodeSequence listNodeSequence =null;
    @Before
    public void setUp() throws Exception {
        listNodeSequence =  new ListNodeSequence(new int[]{1,2,3,2,1});
    }

    @After
    public void tearDown() throws Exception {
        listNodeSequence.print();
    }

    @Test
    public void testIsPalindrome() throws Exception {
        palindrome.isPalindrome(listNodeSequence.head);
    }
}