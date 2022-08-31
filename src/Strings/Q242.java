package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 17:17
 * @Description:
 **/
public class Q242 {
    public boolean isAnagram(String s, String t) {
        int[] arrCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrCount[s.charAt(i) - 'a']--;
        }for (int i = 0; i < t.length(); i++) {
            arrCount[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arrCount.length; i++) {
            if(arrCount[i] != 0)return false;
        }
        return true;

    }
}
