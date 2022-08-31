import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/7/12 10:56
 * @Description:
 **/
public class Q1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int count = nums[0];
        int[] countArray = new int[100];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != count){
                countArray[nums[i]] = i;
                count = nums[i];
            }
        }
        int[] reslut = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reslut[i] = countArray[temp[i]] - countArray[nums[0]];
        }
        return reslut;
    }

    public static void main(String[] args) {
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }
}
