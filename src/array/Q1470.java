package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/29 10:15
 * @Description:
 **/
public class Q1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] f = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i ++) {
            f[i] = nums[i];
            s[i+n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[2*i] = f[i];
            nums[2*i+1] = s[i];
        }
        return nums;
    }
}
