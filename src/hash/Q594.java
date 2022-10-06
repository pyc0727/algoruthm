package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 10:28
 * @Description:
 **/
public class Q594 {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for (Integer integer : map.keySet()) {
            if(map.containsKey(integer+1)){
                ans = Math.max(map.get(integer+1)+map.get(integer),ans);
            }
        }
        return ans;
    }
}
