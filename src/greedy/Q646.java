package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 21:45
 * @Description:
 **/
public class Q646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        int r=     Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if(pair[0] > r){
                ans++;
                r = pair[1];
            }
        }
        return ans;

    }
}
