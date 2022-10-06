package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 14:58
 * @Description:
 **/
public class Q454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int i1 : nums2) {
                map.put(i+i1,map.getOrDefault(i+i1,0)+1);
            }
        }
        int ans = 0;
        for (int i : nums3) {
            for (int j : nums4){
                if(map.containsKey(-i - j)){
                    ans += map.get(-i - j);
                }
            }
        }
        return ans;
    }
}
