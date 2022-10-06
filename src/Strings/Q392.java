package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/1 11:09
 * @Description:
 **/
public class Q392 {
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
