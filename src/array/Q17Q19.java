package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/26 16:43
 * @Description:
 **/
public class Q17Q19 {
    public int[] missingTwo(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for (int num : nums) {
            sum-= num;
        }
        int cur = sum/2;
        int a = cur*(cur + 1)/2;
        for (int num : nums) {
            if(num <= cur)a-=a;
        }
        return new int[]{a,sum-a};
    }
}
