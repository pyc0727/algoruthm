package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 16:20
 * @Description:
 **/
public class Q228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if(r != nums.length-1 && nums[r] + 1 != nums[r+1]){
                if(nums[r] == nums[l]){
                    ans.add(String.valueOf(nums[r]));
                }else{
                    StringBuilder sb = new StringBuilder();
                    sb.append(nums[l]).append("->").append(nums[r]);
                    ans.add(sb.toString());
                }
                l = r+1;
            }
        }
        return ans;
    }
}
