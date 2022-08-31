package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/2 11:29
 * @Description:
 **/
public class Q442 {
    public List<Integer> findDuplicates(int[] nums) {
        for (int num : nums) {
            int x = Math.abs(num);
            nums[x] = 0 - nums[x];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) list.add(i+1);
        }
        return list;
    }
}
