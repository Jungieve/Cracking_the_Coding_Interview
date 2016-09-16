package Array_String;

import java.util.HashMap;

/**
 * Created by ZihanCong on 16/9/14.
 */
public class MaxSubArrayEqualsK {
    public int maxSubArray(int[] nums,int k) {
        // write your code
        int result = 0;
        if(nums == null || nums.length == 0)
            return result;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k))
                result = Math.max(result,i-map.get(sum-k));
            else
                map.put(nums[i]-k,i);
        }
        return result;
    }
}
