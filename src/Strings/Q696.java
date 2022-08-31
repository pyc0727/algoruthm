package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 10:04
 * @Description:
 **/
public class Q696 {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        s = s+"c";
        int left = 0;
        for (int i = 0; i < s.length()-1;) {
            i++;
            if(s.charAt(i) != s.charAt(i-1)){
               list.add(i-left);
               left = i;
            }
        }
        for (int i = 1; i < list.size(); i++) {
            ans += Math.max(list.get(i),list.get(i-1));
        }
        return ans;

    }

    public static void main(String[] args) {
        new Q696().countBinarySubstrings("01010");
    }
}
