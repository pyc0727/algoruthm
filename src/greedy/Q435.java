package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 20:28
 * @Description:
 **/
public class Q435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0)return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int ans = 1;
        int r = intervals[0][1];
        for (int[] interval : intervals) {
            if(interval[0]>r){
                ans++;
                r = interval[1];
            }
        }
        return intervals.length-  ans;
    }
}
