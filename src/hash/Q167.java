package hash;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 08:15
 * @Description:
 **/
public class Q167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length-1;
        int sum;
        while(l < r){
            sum = numbers[l] + numbers[r];
            if(sum > target){
                r--;
            }else if(sum < target){
                l++;
            }else{
                break;
            }
        }
        return new int[]{l+1,r+1};
    }
}
