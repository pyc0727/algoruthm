package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 16:50
 * @Description:
 **/
public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int times = map.getOrDefault(num,0);
            if(times > 0)return true;
            map.put(num,times+1);
        }
        return false;
    }

}
