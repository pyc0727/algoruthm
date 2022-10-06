package Strings;

import java.util.Comparator;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 11:22
 * @Description:
 **/
public class Q524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String value : dictionary) {
            if (isSubsequence(value, s)) {
                if (value.length() > res.length() && (value.compareTo(res) < 0)) {
                    res = value;
                }
            }
        }
        return res;

    }
    public boolean isSubsequence(String s, String t) {
        int l1 = 0;int l2 = 0;
        while(l1 < s.length() && l2 < t.length()){
            while(s.charAt(l1) != t.charAt(l2)){
                l2++;
            }
            l1++;
        }
        return l1 == s.length();
    }

}
