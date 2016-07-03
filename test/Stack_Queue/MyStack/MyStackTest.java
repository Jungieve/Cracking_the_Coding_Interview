package Stack_Queue.MyStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ZihanCong on 16/7/3.
 */
public class MyStackTest {
    MyStack myStackQueue;
    @Before
    public void setUp() throws Exception {
        myStackQueue = new MyStack_ByArrayImpl<>();
        myStackQueue.printStack();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.clear();
        System.out.println(myStackQueue.isEmpty());
    }

    @Test
    public void testClear() throws Exception {
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.clear();
        myStackQueue.printStack();
    }

    @Test
    public void testLength() throws Exception {
        System.out.println(myStackQueue.length());
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        System.out.println(myStackQueue.length());
    }

    @Test
    public void testPush() throws Exception {
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        myStackQueue.push(1);
        myStackQueue.printStack();
    }

    @Test
    public void testPop() throws Exception {
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.pop();
    }

    @Test
    public void testPeek() throws Exception {
        myStackQueue.push(4);
        myStackQueue.push(9);
        myStackQueue.push(10);
        System.out.println(myStackQueue.peek());
    }
}