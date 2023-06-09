package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/12/1 11:01
 * @Description:
 **/
public class Q179 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (distance < ans) {
                    ans = distance;
                    index = i;
                }
            }
        }
        return index;
    }
}
