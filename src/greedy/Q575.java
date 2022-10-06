package greedy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/30 21:58
 * @Description:
 **/
public class Q575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(candyType[i]);
        }
        return Math.min(set.size(),candyType.length/2);
    }
}
