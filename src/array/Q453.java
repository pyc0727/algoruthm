package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/3 11:15
 * @Description:
 **/
public class Q453 {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            sum += min;
        }
        return sum - nums.length * min;
    }

}
