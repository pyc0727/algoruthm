package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/24 17:18
 * @Description:
 **/
public class Q238 {
    public int[] productExceptSelf(int[] nums) {
        int[] start = new int[nums.length];
        start[0] = 1;
        int[] end = new int[nums.length];
        end[nums.length-1] = 1;
        for (int i = 0; i < nums.length -1; i++) {
            start[i+1] = start[i] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            end[i] = end[i+1] * nums[i+1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = start[i] * end[i];
        }
        return res;
    }
}
