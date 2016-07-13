package Tree_Graph;

/**
 * Created by root on 2016/7/13.
 */
public class LCA_rought {

    public TreeNode findLCA(TreeNode root,TreeNode u,TreeNode v) {
        if(root == null) return null;
        if(root == u || root == v)  return root;
        TreeNode left = findLCA(root.left,u,v);
        TreeNode right = findLCA(root.right,u,v);
            //如果左右子节点均不为空，证明u,v在root的左右子树上.
        if(left != null && right != null)   return root;
            //如果仅仅左树不为空，证明u是v的祖先
        else if(left != null) return left;
            //如果仅仅右树不为空，证明v是u的祖先
        else if(right != null)  return right;
        else return null;
    }
}
