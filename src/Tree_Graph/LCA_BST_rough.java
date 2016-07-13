package Tree_Graph;

/**
 * Created by root on 2016/7/13.
 */
public class LCA_BST_rough {
    private TreeNode root;
    public int findLCA(TreeNode u,TreeNode v){
        //保证u和v的顺序，即u总是比v小
        if(u.val > v.val){
            TreeNode temp = v;
            v = u;
            u = temp;
        }
        int left = u.val;
        int right = v.val;
        TreeNode parent = null;
        while(true){
            //如果parent小于u,v，往parent的右子树查找
            if(root.val < left){
                parent = root;
                root = root.right;
            }
            //如果parent大于u,v，往parent的左子树查找
            else if(root.val < left){
                parent = root;
                root = root.left;
            }
            //如果v是u的祖先，返回u的父节点
            else if(root.val == left || root.val == right){
                return parent.val;
            }
            //当 left<root.val<right 说明u和v分居在t的两侧，则当前结点root为最近公共节点
            else return root.val;
        }

    }
}
