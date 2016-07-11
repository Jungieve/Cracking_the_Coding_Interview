package Tree_Graph;

import java.util.Stack;

/**
 * Created by root on 2016/7/11.
 */
public class Successor {
    public int findSucc(TreeNode root, int p) {
        // write code here
        Stack<TreeNode> stack = new Stack();
        TreeNode cur = root;
        boolean isFound = false;
        //DFS进行树的中序遍历
        while(cur!= null || !stack.isEmpty() ){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            if(!stack.isEmpty()){
                TreeNode node = stack.pop();
                if(isFound == true)
                    return node.val;
                if(node.val == p)
                    isFound = true;
                cur = node.right;
            }
        }
        return -1;
    }
}
