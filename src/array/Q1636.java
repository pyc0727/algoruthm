package array;

import java.util.*;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/19 10:48
 * @Description:
 **/
public class Q1636 {
    public int[] frequencySort(int[] nums) {
                Map<Integer,Integer> map = new HashMap<>();
                for (int num : nums) {
                    map.put(num,map.getOrDefault(num, 0)+1);
                }
                List<int[]> list = new ArrayList<>();
                map.forEach((k,v) -> list.add(new int[]{k,v}));
                Collections.sort(list, (a,b)-> a[0] == b[0]?a[1]-b[1]:a[0]-b[0]);
                int[] ans = new int[nums.length];
                int index = 0;
                for (int[] ints : list) {
                    while(ints[1] > 0){
                        ans[index++] = ints[0];
                        ints[1]--;
                    }
                }
                return ans;
    }
}
