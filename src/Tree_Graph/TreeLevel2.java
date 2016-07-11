package Tree_Graph;

/**
 * Created by root on 2016/7/11.
 */
public class TreeLevel2 {
    private    ListNode listnode = new ListNode(-1);
    private    ListNode head = listnode;
    public ListNode getTreeLevel(TreeNode root, int dep) {

        if(dep <= 0 || root == null)
            return null;
        else if(dep == 1){
            listnode.next = new ListNode(root.val);
            listnode = listnode.next;
        }
        else{
            getTreeLevel(root.left,dep-1);
            getTreeLevel(root.right,dep-1);
        }
        return head.next;
    }

}
