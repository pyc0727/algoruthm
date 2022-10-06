package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 17:36
 * @Description:
 **/
public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();
            for (int i : nums1) {
                map.put(i,1);
            }
            for (int i : nums2) {
                if(map.get(i) != null){
                    set.add(i);
                }
            }
            int[] ans = new int[set.size()];
            int index = 0;
            for (Integer integer : set) {
                ans[index++] = integer;
            }
            return ans;

    }
}
