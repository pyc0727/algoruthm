package hash;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/23 14:44
 * @Description:
 **/
public class Q290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        if(words.length != pattern.length())return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            String w = map.get(c);
            if (w == null) {
                if (!set.contains(word)) {
                    set.add(word);
                } else {
                    return false;
                }
                map.put(c, word);
            } else {
                if (!word.equals(w)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "abba";
        String word = "dog cat cat dog";
        wordPattern(s, word);
    }
}
