import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/6/29 16:58
 * @Description:
 **/
public class Q56 {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int start = intervals[0][0];
        int t = intervals[0][1];
        int count = 0;
        int[][] reslut = new int[intervals.length][2];
        for (int i = 1; i < intervals.length; i++) {
            int[] temp = intervals[i];
            if(temp[0] <= t){
                t = Math.max(t, temp[1]);
                continue;
            }
            reslut[count][0] = start;
            reslut[count][1] = t;
            start = intervals[i][0];
            t = intervals[i][1];
            count ++;
        }
        reslut[count][0] = start;
        reslut[count][1] = t;

        return Arrays.copyOf(reslut, count);
    }

    public static void main(String[] args) {
        int[][] ints = {{1,3},{2,6},{8,10},{15,18}};
        merge(ints);
    }
}
