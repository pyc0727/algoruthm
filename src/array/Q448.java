package array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/2 11:12
 * @Description:
 **/
public class Q448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = num % n;
            nums[x-1] = nums[x-1]+n;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= n) res.add(i);
        }
        return res;
    }

}
