package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/2 09:38
 * @Description:
 *
 *
 **/
public class Q645 {

    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] temp = new int[nums.length+1];
        for (int num : nums) {
            if(temp[num] != num){
                temp[num] = num;
            }else{
                res[0] = num;
            }
        }
        for (int i = 1; i < temp.length; i++) {
            if(nums[i] == 0){
                res[1] = i;
                break;
            }
        }
        return res;

    }
}
