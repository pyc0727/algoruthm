package hash;

import java.util.HashMap;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/29 18:39
 * @Description:
 **/
public class Q560 {
    public int subarraySum(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int sum = 0;
            map.put(0,1);
            int res = 0;
            for (int num : nums) {
                sum += num;
                if (map.containsKey(sum - k)) {
                    res += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0));
            }
            return res;
    }
}
