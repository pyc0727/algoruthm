package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 12:15
 * @Description:
 **/
public class Q57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0)return new int[][]{newInterval};
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            list.add(intervals[i++]);
        }
        int l = newInterval[0],r = newInterval[1];
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            l = Math.min(newInterval[0], intervals[i][0]);
            r = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        list.add(new int[]{l,r});
        while(i < intervals.length){
            list.add(intervals[i++]);
        }
        int[][] ans = new int[list.size()][2];
        for (int j = 0; j < list.size(); j++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
