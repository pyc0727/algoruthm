package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/22 14:49
 * @Description:
 **/
public class Q1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int[] piece : pieces) {
            int num = piece[0];
            int index = map.getOrDefault(num,-1);
            if(index == -1)return false;
            for (int i = 1; i < piece.length; i++) {
                index++;
                if( index >= arr.length || arr[index] != piece[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
