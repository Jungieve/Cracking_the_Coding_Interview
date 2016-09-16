package Array_String;

/**
 * Created by root on 2016/9/16.
 */
public class LongestIncresingSubsequence {
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        int[] B = new int[A.length];
        for(int i = 0;i<A.length;i++)
            B[i] = A[A.length-1-i];
        int countA = getSubsequenceCount(A);
        int countB = getSubsequenceCount(B);
        return (countA>countB)?countA:countB;

    }
    public int getSubsequenceCount(int[] A){
        if(A == null || A.length == 0)
            return 0;
        final int len = A.length;
        int result = 0;
        int[] store = new int[len];
        for(int i = 0; i <len;i++)
            store[i] = Integer.MAX_VALUE;
        for(int i = 0; i < len;i++){
            int index = findLowerBound(store,A[i]);
            result = Math.max(result,index+1);
            //update
            store[index] = A[i];
        }
        return result;

    }
    //find target lower bound
    public int findLowerBound(int[] A,int target){
        int lb = -1;
        int ub = A.length;
        while(lb + 1 < ub){
            int mid = (lb+ub)/2;
            if(A[mid] < target)
                lb = mid;
            else
                ub = mid;
        }
        return lb+1;
    }
}
