package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/2 10:08
 * @Description:
 **/
public class Q697 {

    public int findShortestSubArray(int[] nums) {
        Map<Integer,int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int[] array = map.get(nums[i]);
            if(array == null){
                array = new int[4];
                //数字数量
                array[0] = 1;
                //最开始坐标
                array[1] = i;
                //最末尾坐标
                array[2] = i;
                //最短"度"
                array[3] = array[2]-array[1]+1;
                map.put(nums[i],array);
            }else{
                array[0] = array[0] + 1;
                array[2] = i;
                array[3] = array[2]-array[1]+1;
            }
        }
        int maxCount = 0;
        int res = 0;
        for (int[] value : map.values()) {
            if(value[0] > maxCount) {
                maxCount = value[0];
                res = value[3];
            }else if(value[0] == maxCount){
                res = Math.max(value[3],res);
            }
        }
        return res;
    }

}
