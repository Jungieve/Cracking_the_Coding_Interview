package Tree_Graph;

/**
 * Created by ZihanCong on 16/7/6.
 */
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null)	return true;
        int rightHeight = getHeight(root.right,1);
        int leftHeight = getHeight(root.left,1);
        return ((rightHeight-leftHeight)<=1 && (rightHeight-leftHeight)>=-1);

    }
    public int getHeight(TreeNode root,int temp){
        if(root == null)	return temp-1;
        int rightHeight = getHeight(root.right,temp+1);
        int leftHeight = getHeight(root.left,temp+1);
        return (rightHeight>leftHeight)?rightHeight:leftHeight;
    }
}
