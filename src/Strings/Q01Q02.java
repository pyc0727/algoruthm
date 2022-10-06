package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/27 16:21
 * @Description:
 **/
public class Q01Q02 {
    public boolean CheckPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            Integer count = map.get(s2.charAt(i));
            if(count == null || count == 0)return false;
            map.put(s2.charAt(i),count-1);
        }
        for (Integer value : map.values()) {
            if(value > 0)return false;
        }
        return true;
    }
}
