package List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by root on 2016/6/29.
 */
public class PartitionTest {
    Partition partition = new Partition();
    ListNodeSequence listNodeSequence;
    @Before
    public void setUp() throws Exception {
        listNodeSequence = new ListNodeSequence(new int[]{7,2,3,4,5});
    }

    @After
    public void tearDown() throws Exception {
        listNodeSequence.print();
    }

    @Test
    public void testPartition() throws Exception {
        partition.partition(listNodeSequence.head,3);
    }
}