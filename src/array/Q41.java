package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/2 16:17
 * @Description:
 **/
public class Q41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != nums[nums[i] - 1] && nums[i]>0 && nums[i] <= nums.length) swap(i,nums);
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1){
                return i;
            }
        }
        return nums.length + 1;


    }

    private void swap(int i,int[] nums){
        int temp = nums[i];
        nums[i] = nums[temp - 1];
        nums[temp - 1] =temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3,4,-1,1};
        Q41 q41 = new Q41();
        q41.firstMissingPositive(test);
    }

}
