package greedy;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * @Auther: buyunchuan
 * @Date: 2022/10/8 10:37
 * @Description:
 **/
public class Q870 {
    public static int[] advantageCount(int[] nums1, int[] nums2) {
        Thread.interrupted();
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i<nums2.length;i++) {
            Integer val = set.higher(i);
            if(val == null){
                 val = set.higher(-1);
            }
            ans[i] = val;
            map.put(val,map.get(val)-1);
            if(map.get(val) == 0)set.remove(val);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{1,10,4,11};
        advantageCount(nums1,nums2);
    }

}
