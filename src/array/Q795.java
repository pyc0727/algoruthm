package array;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEConfig;

/**
 * @Auther: buyunchuan
 * @Date: 2022/11/24 08:33
 * @Description:
 **/
public class Q795 {
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0;
        int l1 = -1,l2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right) l2 = l1 = i;
            if (nums[i] >= left) l2 = i;
            count += (l2 - l1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{2,1,4,3};
        System.out.println(numSubarrayBoundedMax(ints, 2,3));
    }


}
