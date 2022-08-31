package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/4 16:06
 * @Description:
 **/
public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            for (int j = 1; j <= i ; j++) {
                if(j == 1 || j == i) list.add(1);
                else{
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        Q118 q118 = new Q118();
        q118.generate(5);
    }
}
