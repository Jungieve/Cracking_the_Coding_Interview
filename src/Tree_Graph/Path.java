package Tree_Graph;

import java.util.*;

/*
public class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}*/
public class Path {
    public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
        if(a == null || b == null)	return false;
        return bfs(a,b)||bfs(b,a);
    }
    public boolean bfs(UndirectedGraphNode a, UndirectedGraphNode b){
        Queue<UndirectedGraphNode> queue = new LinkedList();
        HashSet<UndirectedGraphNode> map = new HashSet();
        queue.offer(a);
        map.add(a);
        while(!queue.isEmpty()){
            UndirectedGraphNode node = queue.poll();
            if(node == b)	return true;
            for(int i = 0;i<node.neighbors.size();i++){
                UndirectedGraphNode temp = node.neighbors.get(i);
                if(!map.contains(temp)){
                    queue.offer(temp);
                    map.add(temp);
                }
            }
        }
        return false;
    }
}