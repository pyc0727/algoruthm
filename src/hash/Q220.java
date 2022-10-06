package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 09:46
 * @Description:
 **/
public class Q220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        // 🪣排序
        long size = valueDiff + 1;
        Map<Long,Long> tong = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long val = nums[i];
            long index = getIndex(val,size);
            if(tong.containsKey(index))return true;
            tong.put(index,val);
            long l = index-1,r = index+1;
            if(tong.containsKey(l) && val - tong.get(l) <= valueDiff)return true;
            if(tong.containsKey(r) && tong.get(r) - val <= valueDiff)return true;
            // 删除角标外🪣
            if(i > indexDiff)tong.remove(getIndex(nums[i-indexDiff],size));
        }
        return false;
    }

    private static long getIndex(long num,long size){
        return num>=0?num/size:((num+1)/size)-1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,9,1,5,9};
        containsNearbyAlmostDuplicate(nums,2,3);
    }
}
