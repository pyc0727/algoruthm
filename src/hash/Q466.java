package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/27 18:41
 * @Description:
 **/
public class Q466 {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int[] s2count = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            s2count[s2.charAt(i) - 'a']+=n2;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i), 0)+n1);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if(s2count[i] == 0)continue;
            ans = Math.min(ans,map.get((char)(i+'a'))/s2count[i]);
        }
        return ans;
    }
}
