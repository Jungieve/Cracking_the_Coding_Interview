package List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZihanCong on 16/6/13.
 */
public class SingleLinkedListTest {
    SingleLinkedList<Integer> singleLinkedList;

    @Before
    public void setUp() throws Exception {
        singleLinkedList = new SingleLinkedList<>(12);
    }

    @After
    public void tearDown() throws Exception {
//        singleLinkedList.clear();
        singleLinkedList.print();
    }

    @Test
    public void testAdd() throws Exception {
        singleLinkedList.add(0,3);
        singleLinkedList.add(1,4);
        singleLinkedList.add(0,2);
        singleLinkedList.add(2,8);

    }

    @Test
    public void testAppend() throws Exception {
        singleLinkedList.append(16);
        singleLinkedList.append(17);
        singleLinkedList.append(19);
    }

    @Test
    public void testRemove() throws Exception {
        this.testAdd();
        singleLinkedList.remove(0);
        singleLinkedList.remove(2);
        singleLinkedList.remove(2);
        singleLinkedList.remove(0);
        singleLinkedList.append(9);
        singleLinkedList.remove(0);
    }

    @Test
    public void testClear() throws Exception {
        singleLinkedList.clear();
    }

    @Test
    public void testGet() throws Exception {
        this.testAdd();
        System.out.println(singleLinkedList.get(0));
        System.out.println(singleLinkedList.get(3));

    }

    @Test
    public void testPrint() throws Exception {
        singleLinkedList.print();
    }
}