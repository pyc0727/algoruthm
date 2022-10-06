package hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/29 19:28
 * @Description:
 **/
public class Q523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i < sum.length; i++) {
            set.add(sum[i-2] % k);
            if(set.contains(sum[i] % k))return true;
        }
        return false;
    }
}
