package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 13:47
 * @Description:
 **/
public class Q434 {
    public int countSegments(String s) {
        int ans = 0;
        s = s+" ";
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) != ' ' && s.charAt(i+1) == ' ')
                ans++;
        }
        return ans;
    }
}
