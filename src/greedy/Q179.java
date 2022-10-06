package greedy;

import java.util.Arrays;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/1 07:33
 * @Description:
 **/
public class Q179 {
    public String largestNumber(int[] nums) {
        String[] ss = new String[nums.length];
        for (int i = 0; i < nums.length; i++) ss[i] = nums[i]+"";
        Arrays.sort(ss, (a,b)->{
            String ab = a+b;
            String ba = b+a;
            return ba.compareTo(ab);
        });
        if(ss[0].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : ss) {
            sb.append(s);
        }
        return sb.toString();
    }
}