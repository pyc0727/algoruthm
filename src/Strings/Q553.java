package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 16:25
 * @Description:
 **/
public class Q553 {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length-1; i++) {
            sb.append(nums[i]).append("/");
        }
        sb.append(nums[nums.length-1]);
        if(nums.length > 2){
            sb.insert(sb.indexOf("/")+1,"(");
            sb.append(")");
        }
        return sb.toString();

    }
}
