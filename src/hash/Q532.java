package hash;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/26 20:32
 * @Description:
 **/
public class Q532 {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        if(k == 0){
            for (Integer value : map.values()) {
                if(value > 1)sum++;
            }
        }else{
            Set<Integer> list = map.keySet();
            for (Integer integer : list) {
                if(map.containsKey(integer+k))sum++;
            }
        }
        return sum;
    }
}
