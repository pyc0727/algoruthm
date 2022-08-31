package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/8 12:36
 * @Description:
 **/
public class Q189 {
    public void rotate(int[] nums, int k) {
        change(nums,0,nums.length-1);
        change(nums,0,k-1);
        change(nums,k,nums.length-1);
    }


    private void change(int[] nums,int start, int end){
        int mid = (start+end)/2;
        for (int i = start; i <= mid ; i++) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new Q189().rotate(nums,3);
    }
}
