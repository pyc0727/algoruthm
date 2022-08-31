package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/10 20:46
 * @Description:
 **/
public class Q396 {
    public int maxRotateFunction(int[] nums) {
        int[] F = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            F[0] += i * nums[i];
        }

        int res = F[0];
        for (int i = 1; i < nums.length; i++) {
            F[i] = F[i-1] + sum - nums.length * nums[nums.length - i];
            res = Math.max(res, F[i]);
        }
        return res;
    }
}
