package Strings;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 16:04
 * @Description:
 **/
public class Q539 {
    public int findMinDifference(List<String> timePoints) {
        int[] arr = new int[timePoints.size()*2];
        for (int i = 0; i < timePoints.size(); i++) {
            String[] nums = timePoints.get(i).split(":");
            int count = Integer.valueOf(nums[0]) * 60 + Integer.valueOf(nums[1]);
            arr[i] = count;
            arr[i+timePoints.size()] = count+(24*60);
        }
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            ans = Math.min(arr[i] - arr[i-1],ans);
        }
        return ans;
    }
}
