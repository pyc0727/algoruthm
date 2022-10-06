package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/26 20:41
 * @Description:
 **/
public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hash = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            Character res = hash.get(sc);
            if(res == null){
                if(set.contains(tc)){
                    return false;
                }
                hash.put(sc,tc);
                set.add(tc);
            }else{
                if(tc != res)return false;
            }
        }
        return true;

    }
}
