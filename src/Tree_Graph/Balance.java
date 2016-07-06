package Tree_Graph;

/**
 * Created by ZihanCong on 16/7/6.
 */
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null)	return true;
        int rightHeight = getHeight(root.right);
        int leftHeight = getHeight(root.left);
        if(Math.abs(rightHeight-leftHeight)<1)
            return isBalance(root.left)&&isBalance(root.right);
        else
            return false;

    }
    public int getHeight(TreeNode root){
        if(root == null)	return 0;
        int rightHeight = getHeight(root.right);
        int leftHeight = getHeight(root.left);
        return Math.max(rightHeight,leftHeight)+1;
    }
}
