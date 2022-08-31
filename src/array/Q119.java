package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/4 16:20
 * @Description:
 **/
public class Q119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>(rowIndex);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>(i);
            for (int j = 1; j <= i ; j++) {
                if(j == 1 || j == i) list.add(1);
                else{
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(list);
        }
        return res.get(rowIndex-1);
    }


}
