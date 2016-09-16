package Stack_Queue;

import java.util.LinkedList;

/**
 * Created by ZihanCong on 16/9/14.
 */
public class MaxWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        if(nums == null || k<1 || nums.length < k)
            return null;
        LinkedList<Integer> queue = new LinkedList();
        int index = 0;
        for(int i=0;i<nums.length;i++){
            while(!queue.isEmpty() && nums[i] >= nums[queue.peekLast()])
                queue.pollLast();
            queue.addLast(i);
            if(queue.peekFirst() == i-k)
                queue.pollFirst();
            if(i >= k-1)
                result[index++] = nums[queue.peekFirst()];
        }
        return result;
    }
}
