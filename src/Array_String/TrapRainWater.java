package Array_String;

/**
 * Created by root on 2016/9/16.
 */
public class TrapRainWater {
    public int trapRainWater(int[] heights) {
        // write your code here
        if(heights == null || heights.length <=2)
            return 0;
        int leftCursor = 1;
        int rightCursor = heights.length - 2;
        int leftMax = heights[0];
        int rightMax = heights[heights.length - 1];
        int count = 0;
        while(leftCursor <= rightCursor){
            if(leftMax < rightMax){
                int value = leftMax - heights[leftCursor];
                count += value>0?value:0;
                leftMax = Math.max(heights[leftCursor],leftMax);
                leftCursor++;
            }
            else{
                int value = rightMax - heights[rightCursor];
                count += value>0?value:0;
                rightMax = Math.max(heights[rightCursor],rightMax);
                rightCursor--;
            }
        }
        return count;
    }
}
