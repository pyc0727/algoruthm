package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/29 16:47
 * @Description:
 **/
public class Q0109 {
    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1+s1).contains(s2);
    }
}
