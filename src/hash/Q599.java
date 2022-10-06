package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 08:29
 * @Description:
 **/
public class Q599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }
        List<String> ss = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer intv = map.get(list2[i]);
            if(intv != null && (sum>= intv + i)){
                if(sum == intv+i){
                    ss.add(list2[i]);
                }else{
                    sum = intv + i;
                    ss.clear();
                    ss.add(list2[i]);
                }
            }

        }
        String[] res = new String[ss.size()];
        for (int i = 0; i < ss.size(); i++) {
            res[i] = ss.get(i);
        }
        return res;
    }
}
