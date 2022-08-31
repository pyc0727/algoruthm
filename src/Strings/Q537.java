package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 16:31
 * @Description:
 **/
public class Q537 {
    public static  String complexNumberMultiply(String num1, String num2) {
        String[] nums1 = num1.replace("i","").split("\\+");
        String[] nums2 = num2.replace("i","").split("\\+");
        int a = Integer.valueOf(nums1[0])*Integer.valueOf(nums2[0]) - Integer.valueOf(nums1[1])*Integer.valueOf(nums2[1]);
        int b = Integer.valueOf(nums1[1])*Integer.valueOf(nums2[0]) + Integer.valueOf(nums1[0])*Integer.valueOf(nums2[1]);
        return a + "+" +b+"i";
    }

    public static void main(String[] args) {
        complexNumberMultiply("1+1i","1+1i");
    }
}
