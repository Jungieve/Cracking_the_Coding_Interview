package Tree_Graph;

/**
 * Created by root on 2016/7/11.
 */
public class Checker {
    public boolean checkBST(TreeNode root) {
        // write code here++++++
        if(root == null)	return true;
        if(root.left != null){
            if(root.left.val > root.val)	return false;
            if(root.left.right != null && root.left.right.val > root.val)	return false;
        }
        if(root.right != null){
            if(root.right.val < root.val)	return false;
            if(root.right.left != null && root.right.left.val < root.val)	return false;
        }
        return checkBST(root.right) && checkBST(root.left);
    }
}
