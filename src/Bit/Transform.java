package Bit;

/**
 * Created by root on 2016/7/16.
 */
public class Transform {
    public int calcCost(int A, int B) {
        // write code here
        int res = A^B;
        int count = 0;
        while(res!=0){
            if((res & 1)!=0)
                count++;
            res >>= 1;
        }
        return count;
    }
}
