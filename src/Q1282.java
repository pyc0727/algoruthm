import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/12 10:09
 * @Description:
 **/
public class Q1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List list = map.get(groupSizes[i]);
            if(list == null){
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(groupSizes[i],list );
        }
        List<List<Integer>> res = new ArrayList<>();
        map.forEach((k,v) -> {
            List<Integer> temp = new ArrayList<>(k);
            for (int i = 0; i < v.size(); i++) {
                if(i % k == 0){
                    temp = new ArrayList<>(k);
                    res.add(temp);
                }
                temp.add(v.get(i));
            }
        });
        return res;
    }

}
