import java.util.Arrays;
import java.util.HashMap;

/**
 * @Auther: buyunchuan
 * @Date: 2022/6/28 09:24
 * @Description:
 **/
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            hash.put(nums[i], i);
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer val = hash.get(target - nums[i]);
            if(val == null){
                continue;
            }
            if(i == val){
                continue;
            }
            res[0] = i;
            res[1] = val;
        }
        return res;
    }
}
