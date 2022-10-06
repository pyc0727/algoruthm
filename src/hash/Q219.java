package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 08:43
 * @Description:
 **/
public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val = map.get(nums[i]);
            if(val != null && Math.abs(val - i)<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
