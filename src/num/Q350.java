package num;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 10:33
 * @Description:
 **/
public class Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if(map.containsKey(i) && map.get(i)>0){
                list.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
