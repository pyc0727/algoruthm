package DP;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/23 09:07
 * @Description:
 **/
public class Q494 {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        int diff = sum - target;
        if(diff < 0 || diff % 2 != 0)return 0;
        int col = diff/2;
        int[] ans = new int[col+1];
        ans[0] = 1;
        for (int num : nums) {
            for (int i = col; i >= num ; i--) {
                ans[i] += ans[i-num];
            }
        }
        return ans[col];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        findTargetSumWays(nums, 3);
    }
}
