package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 17:01
 * @Description:
 **/
public class Q387 {
    public int firstUniqChar(String s) {
        int[] arrs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(arrs[s.charAt(i) - 'a'] == 1)return i;
        }
        return -1;
    }
}
