package num;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/7 11:13
 * @Description:
 **/
public class Q670 {
    public static int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        int l = 0,r = chars.length;
        while(l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        char[] source = String.valueOf(num).toCharArray();
        for (int i = 0; i < source.length; i++) {
            if(source[i] == chars[i])continue;
            for (int j = i+1; j < source.length; j++) {
                if(source[j] == chars[i]){
                    char temp = source[i];
                    source[i] = source[j];
                    source[j] = temp;
                    break;
                }
            }
        }
        return Integer.parseInt(new String(source));
    }

    public static void main(String[] args) {
        maximumSwap(2736);
    }
}
