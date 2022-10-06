package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 17:23
 * @Description:
 **/
public class Q452 {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int ans = 0;
        int l = points[0][0],r = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if(points[i][0]>r ){
                ans +=1;
                    l = points[i][0];
                    r = points[i][0];
            }else {
                l = Math.max(l,points[i][0]);
                r = Math.min(r,points[i][1]);
            }
        }
        return ans+1;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        findMinArrowShots(points);
    }


}
