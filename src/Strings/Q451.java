package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/29 13:43
 * @Description:
 **/
public class Q451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = map.getOrDefault(s.charAt(i),0)+1;
            max = Math.max(val,max);
            map.put(s.charAt(i),val);
        }
        StringBuilder[] builders = new StringBuilder[max];
        for (int i = 0; i < builders.length; i++) {
            builders[i] = new StringBuilder();
        }
        map.forEach((k,v) -> builders[v-1].append(k));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < builders.length; i++) {
            for (int j = 0; j < builders[i].length(); j++) {
                for (int k = 0; k <= i; k++) {
                    stringBuilder.append(builders[i].charAt(j));
                }
            }
        }
        return stringBuilder.toString();

    }
}
