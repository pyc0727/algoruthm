package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 14:06
 * @Description:
 **/
public class Q344 {
    public void reverseString(char[] s) {
        int left = 0,right = s.length-1;
        while(left <= right){
            char temp = s[left];
            s [left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }
}
