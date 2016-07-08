package Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevel {
    public ListNode getTreeLevel(TreeNode root, int dep) {
        // write code here
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList();
        Queue<TreeNode> queueNext = new LinkedList();
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        int nowDep = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            if (nowDep == dep) {
                for (TreeNode t : queue) {
                    dummy.next = new ListNode(t.val);
                    dummy = dummy.next;
                }
                return result.next;
            }
            TreeNode temp = queue.poll();
            if (temp.left != null)
                queueNext.offer(temp.left);
            if (temp.right != null)
                queueNext.offer(temp.right);
            if (queue.isEmpty()) {
                Queue<TreeNode> tempQueue = queueNext;
                queueNext = queue;
                queue = tempQueue;
                nowDep++;
            }

        }
        return result.next;
    }
}