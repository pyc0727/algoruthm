package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/26 17:13
 * @Description:
 **/
public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arrCount = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            arrCount[ransomNote.charAt(i) - 'a']--;
        }for (int i = 0; i < magazine.length(); i++) {
            arrCount[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arrCount.length; i++) {
            if(arrCount[i] < 0)return false;
        }
        return true;

    }
}
