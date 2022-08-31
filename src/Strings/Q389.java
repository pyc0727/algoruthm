package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 17:09
 * @Description:
 **/
public class Q389 {
    public char findTheDifference(String s, String t) {
            int[] arrCount = new int[26];
            for (int i = 0; i < s.length(); i++) {
                arrCount[s.charAt(i) - 'a']--;
                arrCount[t.charAt(i) - 'a']++;
            }
            arrCount[t.charAt(t.length()-1) - 'a']++;
            for (int i = 0; i < arrCount.length; i++) {
                if(arrCount[i] == 1) return (char) ('a'+i);
            }
            return ' ';

    }
}
