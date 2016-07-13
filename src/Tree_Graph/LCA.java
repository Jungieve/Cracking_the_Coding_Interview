package Tree_Graph;

/**
 * Created by root on 2016/7/13.
 */
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while(a!=b){
            if(a>b)	a/=2;
            else	b/=2;
        }
        return a;

    }
}
