package Tree_Graph;

/**
 * Created by root on 2016/7/11.
 */
public class Checker2 {
    public boolean checkBST(TreeNode root) {
        // write code here++++++
        return checkByRange(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean checkByRange(TreeNode root,int min,int max){
        if(root == null)	return true;
        if(root.val < min || root.val > max)	return false;
        return checkByRange(root.left,min,root.val) && checkByRange(root.right,root.val,max);
    }
}