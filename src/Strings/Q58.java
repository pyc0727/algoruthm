package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 14:01
 * @Description:
 **/
public class Q58 {

    public int lengthOfLastWord(String s) {
        s = " "+s;
        int r = s.length()-1;
        while(s.charAt(r) == ' ')r--;
        int l = r;
        while(s.charAt(l) != ' ')l--;
        return r-l;
    }
}
