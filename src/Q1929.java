/**
 * @Auther: buyunchuan
 * @Date: 2022/6/29 16:23
 * @Description:
 **/
public class Q1929 {
    public int[] getConcatenation(int[] nums) {
        if(nums.length == 0)
            return nums;
        int[] res = new int[nums.length * 2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
           res[i] = nums[i];
           res[i + n] = nums[i];
        }
        return res;
    }
}
