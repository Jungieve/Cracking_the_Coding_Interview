package Tree_Graph;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by root on 2016/7/13.
 */
public class FindPath {
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,
                                                      int target) {
            ArrayList<ArrayList<Integer>> pathList=
                    new ArrayList<ArrayList<Integer>>();
            if(root==null)
                return pathList;
            Stack<Integer> stack=new Stack<Integer>();
            FindPath(root,target,stack,pathList );
            return pathList;

        }
        private void FindPath(TreeNode root, int target,
                              Stack<Integer> path,
                              ArrayList<ArrayList<Integer>> pathList) {
            if(root==null)
                return;
            if(root.left==null&&root.right==null){
                if(root.val==target){
                    ArrayList<Integer> list=
                            new ArrayList<Integer>();
                    for(int i:path){
                        list.add(new Integer(i));
                    }
                    list.add(new Integer(root.val));
                    pathList.add(list);
                }
            }
            else{
                path.push(new Integer(root.val));
                FindPath(root.left, target-root.val, path, pathList);
                FindPath(root.right, target-root.val, path,  pathList);
                path.pop();
            }

        }

}
