package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/22 15:31
 * @Description:
 **/
public class Q128 {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,1);
        }
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(num - 1))continue;
            int index = i;
            while(map.containsKey(++num)){
                index++;
            }
            ans = Math.max(ans,index-i+1);
        }
        return ans;
    }
}
