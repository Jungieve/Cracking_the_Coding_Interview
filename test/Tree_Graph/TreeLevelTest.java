package Tree_Graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by ZihanCong on 16/7/7.
 */
public class TreeLevelTest {
    TreeNode treeNode = new TreeNode(1);
    TreeLevel treeLevel = new TreeLevel();
    ListNode result = null;
    @Before
    public void setUp() throws Exception {
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
    }

    @After
    public void tearDown() throws Exception {
        while(result!=null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }

    @Test
    public void testGetTreeLevel() throws Exception {
        result = treeLevel.getTreeLevel(treeNode,3);
    }
}