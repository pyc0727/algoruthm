package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/8 10:57
 * @Description:
 **/
public class Q1800 {
    public static int maxAscendingSum(int[] nums) {
        int ans = nums[0],cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                cur += nums[i];
            }else{
                cur = nums[i];
            }
            ans = Math.max(cur,ans);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,10,6};
        maxAscendingSum(nums);
    }
}
