package array;

import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/14 10:01
 * @Description:
 **/
public class Q1619 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = arr.length/20; i < arr.length - arr.length/20; i++) {
            ans += arr[i];
        }
        return ans * 1.0/(arr.length * 0.9);
    }
}
