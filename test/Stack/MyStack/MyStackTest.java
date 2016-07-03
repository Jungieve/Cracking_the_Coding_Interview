package Stack.MyStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/7/3.
 */
public class MyStackTest {
    MyStack myStack;
    @Before
    public void setUp() throws Exception {
        myStack = new MyStackByArrayImpl<>();
        myStack.printStack();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.clear();
        System.out.println(myStack.isEmpty());
    }

    @Test
    public void testClear() throws Exception {
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.clear();
        myStack.printStack();
    }

    @Test
    public void testLength() throws Exception {
        System.out.println(myStack.length());
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        System.out.println(myStack.length());
    }

    @Test
    public void testPush() throws Exception {
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        myStack.push(1);
        myStack.printStack();
    }

    @Test
    public void testPop() throws Exception {
        myStack.push(4);
        myStack.push(9);
        myStack.pop();
    }

    @Test
    public void testPeek() throws Exception {
        myStack.push(4);
        myStack.push(9);
        myStack.push(10);
        System.out.println(myStack.peek());
    }
}