package hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 10:47
 * @Description:
 **/
public class Q554 {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        for (List<Integer> integers : wall) {
            int ans = 0;
            for (int i = 0; i < integers.size()-1; i++) {
                ans += integers.get(i);
                map.put(ans,map.getOrDefault(ans,0)+1);
            }
        }
        int res = wall.size();
        int n = wall.size();
        for (Integer integer : map.keySet()) {
            res = Math.min(res,n-map.get(integer));
        }
        return res;
    }
}
