package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/5 17:28
 * @Description:
 **/
public class Q477 {
    public int totalHammingDistance(int[] nums) {
        int[] ans0 = new int[32];
        int[] ans1 = new int[32];
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                if((1 & (nums[j] >> i)) == 1){
                    ans1[i]++;
                }else {
                    ans0[i]++;
                }
            }
            ans += ans1[i]*ans0[i];
        }
        return ans;
    }
}
