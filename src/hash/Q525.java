package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/29 19:42
 * @Description:
 **/
public class Q525 {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0,ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                sum -= 1;
            }else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                ans = Math.max(ans,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}
