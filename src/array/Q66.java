package array;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 14:54
 * @Description:
 **/
public class Q66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            digits[i]++;
            if( digits[i] != 10 ){
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
