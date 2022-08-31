package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/4 14:52
 * @Description:
 **/
public class Q665 {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(count > 1) return false;
            if(nums[i] < nums[i - 1]){
                if(i == 1 || (nums[i] >= nums[i-2])){
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }
                count++;
            }
        }
        return true;
    }
}
