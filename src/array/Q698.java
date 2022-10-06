package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/20 10:41
 * @Description:
 **/
public class Q698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int ans = 0;
        for (int num : nums) {
            ans += num;
        }
        if(ans % k != 0)return false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return true;
    }
}
